package fpp.lab6.lab6_4;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] strArr = new String[]{"one", "two", "three", "four", "five", "six"};

        System.out.println("Default comparator:");
        StringSort sortVar = new StringSort(new StringLengthComparator());
        System.out.println(Arrays.toString(sortVar.stringSort(strArr)));

        System.out.println("\nAnonymous:");
        MainAnonymous m = new MainAnonymous(strArr);

        System.out.println("\nLambda:");
        MainLambda l = new MainLambda(strArr);
    }

}