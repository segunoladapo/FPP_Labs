package fpp.lab7;

public class MainSort {

    public static void main(String[] args) {
        MinSort ms = new MinSort();
        String result = ms.sort("zwxuabfkafutbbbb");
        System.out.println(result);

        String result1 = ms.sort("no more time in exam"); // spaces included to index
        System.out.println(result1);

    }

}
