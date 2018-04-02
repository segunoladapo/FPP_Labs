package fpp.lab9;

/**
 * Created by segun on 3/16/2018.
 */
public class Main {
    public static void main(String... args) {
        MyStringStack stack = new MyStringStack();
        stack.push("Bob");
       // stack.push("Harry");
       // stack.push("Alice");
       // stack.push("segun");
        System.out.println("Popping…" + stack.pop());
       // System.out.println("Peeking…." + stack.peek());
        System.out.println("Popping…" + stack.pop());
        System.out.println("Popping…" + stack.pop());
        System.out.println("Popping…" + stack.pop());
        System.out.println("Popping…" + stack.pop());
        System.out.println("Is empty " + stack.isEmpty());

        stack.printNodes();
    }

}
