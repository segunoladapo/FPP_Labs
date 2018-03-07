package fpp.lab2;

import java.util.Scanner;

public class Prog5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Type the word you want to reverse: ");
        String word = sc.nextLine();
        for (int i = word.length() - 1; i >= 0; i--){
            System.out.print(word.charAt(i));
        }
    }
}
