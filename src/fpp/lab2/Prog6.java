package fpp.lab2;

public class Prog6 {


    public static String[] removeDups(String[] input) {
        if (input.length == 0 || input.length == 1)
            return input;
        String[] temp = new String[input.length];
        int noOfNonDuplicateElement = 0;
        OuterLoop:
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i].equals(input[j])) {
                    continue OuterLoop;
                }

            }
            temp[noOfNonDuplicateElement++] = input[i];
        }

        String[] retVal = new String[noOfNonDuplicateElement];
        System.arraycopy(temp, 0, retVal, 0, noOfNonDuplicateElement);
        return retVal;
    }
}
