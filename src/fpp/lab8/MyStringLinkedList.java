package fpp.lab8;

public class MyStringLinkedList {
    Node header;

    MyStringLinkedList() {
        header = new Node(null, null, null);
    }

    public void addFirstTest(String item) {

        if (header.next == null) {
            Node n = new Node(header.next, header, item);
            header.next = n;
        } else {
            Node current = header.next;

            if (current.value.compareTo(item) > 0) {
                Node n = new Node(header.next, header, item);
                header.next = n;
                current.previous = n;
            } else {

                //if (current.next == null) {
                //    Node n = new Node(null, current, item);
                //    current.next = n;
                //} else {
                Node n = new Node(current.next, current, item);
                // current.next.previous = n;
                current.next = n;
                // }
            }
        }
    }


    public void addFirst(String item) {
        Node n = new Node(header.next, header, item);
        if (header.next != null) {
            header.next.previous = n;
        }
        header.next = n;
    }

    boolean remove(String data) {
        Node node = header;
        boolean found = false;
        while (node != null) {
            if ((data).equals(node.value)) {
                found = true;
                node.previous.next = node.next;
                break;
            }
            node = node.next;
        }
        return found;
    }

    void printNodes() {
        Node next = header.next;
        if (next == null) System.out.println("");
        else {
            String s = next.toString();
            System.out.println(s);
        }
    }

    class Node {
        String value;
        Node next;
        Node previous;

        Node(Node next, Node previous, String value) {
            this.next = next;
            this.previous = previous;
            this.value = value;
        }

        @Override
        public String toString() {
            if (value == null) return "";
            StringBuilder sb = new StringBuilder(value + " ");
            sb = toString(sb, next);
            return sb.toString();
        }

        private StringBuilder toString(StringBuilder sb, Node n) {
            if (n == null) return sb;
            sb.append(n.value + " ");
            return toString(sb, n.next);
        }


    }

    public static void main(String[] args) {
        MyStringLinkedList list = new MyStringLinkedList();
        list.addFirstTest("J");
        list.addFirstTest("A");
        list.addFirstTest("B");
        list.addFirstTest("C");
        //list.addFirstTest("A");
        // System.out.println(list.header.next.previous.next.value);

        //     list.remove("B");
        list.printNodes();
    }

    public void addFirstAnother(String item) {

        if (header.next == null) {
            Node node = new Node(header.next, header, item);
            header.next = node;
        } else {
            Node currentNode = header.next;
            if(currentNode.value.compareTo(item) > 0){
                Node node = new Node(header.next, header, item);
                header.next = node;
            }else{
                Node node = new Node(currentNode.next, currentNode, item);
                currentNode.next = node;
            }
        }

    }

}


