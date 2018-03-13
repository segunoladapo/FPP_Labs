package fpp.lab6;
public class Top {

    int t = 1;
    Middle mid;
    Middle.Bottom midbot;
    //returns the value in the instance vble of Bottom

    public Top() {
        mid = new Middle();
        midbot = mid.new Bottom();
    }

    int readBottom() {
        //implement
        return midbot.b;
    }
    class Middle {
        int m = 2;
        //returns sum of instance variabble in Top and
        //instance variabble in Bottom
        int addTopAndBottom() {
            //implement
            return (Top.this.t + Top.this.readBottom());
        }
        class Bottom {
            int b = 3;
            //returns the product of the instance variabbles
            //in all three classes
            int multiplyAllThree() {
                //implement
                return b*Middle.this.m*Top.this.t;
            }
        }
    }
    public static void main(String[] args){
        Top top = new Top();

        System.out.println(top.readBottom());
        System.out.println(top.mid.addTopAndBottom());
        System.out.println(top.midbot.multiplyAllThree());

    }

}
