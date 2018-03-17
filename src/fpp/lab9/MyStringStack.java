package fpp.lab9;

/**
 * Created by segun on 3/16/2018.
 */
public class MyStringStack {
    private MyStringLinkedList list = new MyStringLinkedList();

    public String peek() {
        return list.header.next.value;
    }

    public void push(String item) {
        list.addFirst(item);
    }

    public String pop() {
        return list.remove();
    }

    public void printNodes() {
        list.printNodes();
    }


}
