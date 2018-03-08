package fpp.midtermpractice;

public class Driver {
    public static void main(String[] args) {
        Maker[] objArr = {new HatMaker(),
                new HatMaker(),
                new VeeMaker(),
                new ParallelMaker()};
        new Driver(objArr);
    }

    public Driver(Maker[] figures) {
        final String SPACE = " ";
        for (Maker o : figures) {
            System.out.print(o.getFigure() + SPACE);
        }
    }

}
