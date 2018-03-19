package fpp.lab9.lab9_2;


import fpp.lab9.MyStringStack;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class SymbolBalancer {
    String ODD_DELIMITER = "" + (char) 0;
    String filename;
    String text;
    char[] left;
    char[] right;

    public SymbolBalancer(String filename) {
        // this.filename = filename;
        // readFile();
    }

    public void setText(String text) {
        this.text = text;
    }

    boolean symbolsBalanced(String delimiters) {
        //implement
        MyStringStack stack = new MyStringStack();
        for (int i = 0; i < delimiters.length(); i++) {
            String token = String.valueOf(delimiters.charAt(i));
            switch (token) {
                case "(":
                case "[":
                case "{": {
                    stack.push(token);
                    break;
                }
                case ")":
                case "]":
                case "}": {
                    if (stack.isEmpty())
                        return false;
                    String popedItem = stack.pop();
                    if (findMatch(token).equals(popedItem))
                        continue;
                    else {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();

    }

    private String findMatch(String token) {
        String equivalentStr = null;
        switch (token) {
            case "}":
                equivalentStr = "{";
                break;
            case "]":
                equivalentStr = "[";
                break;
            case "(":
                equivalentStr = ")";
                break;
        }
        return equivalentStr;
    }

    public static void main(String[] args) {
        SymbolBalancer sb = new SymbolBalancer("Employee.java");
        System.out.println(sb.symbolsBalanced("[]{}"));
    }

    void readFile() {
        try {
            Scanner sc = new Scanner(new File(filename));
            sc.useDelimiter(ODD_DELIMITER);
            text = sc.next();
            System.out.println(text);
            sc.close();
        } catch (FileNotFoundException ex) {
            System.err.println("File Not Found Exception " + ex.getMessage());
        }
    }

}



