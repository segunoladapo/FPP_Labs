package fpp.lab7;

public class DivideSort {

    public String divideSort(String unsortedString) {
        if (unsortedString.length() == 0 || unsortedString.length() == 1)
            return unsortedString;
        int mid = unsortedString.length() / 2;
        String firstHalf = unsortedString.substring(0, mid);
        String secondHalf = unsortedString.substring(mid + 1);
        //if(firstHalf.charAt(0) > secondHalf.charAt(0)
        return null;
    }
}
