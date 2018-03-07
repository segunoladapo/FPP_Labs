package fpp.lab2;

public class Prog2_8 {
    static int min(int[] arrayOfInts){
        int minElement = arrayOfInts[0];
        for(int i = 1; i < arrayOfInts.length; i++){
            if(minElement > arrayOfInts[i])
                minElement = arrayOfInts[i];
        }
        return minElement;
    }
}
