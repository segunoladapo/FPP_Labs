package fpp.lab9;

public class MyStringLinkedList {
    Node header;

    MyStringLinkedList() {
        header = new Node(null, null, null);
    }

    public void addFirst(String item) {
        Node n = new Node(header.next, header, item);
        if (header.next != null) {
            header.next.previous = n;
        }
        header.next = n;

    }

    String remove() {
        String item = null;
        if (header.next != null) {
            Node nodeToRemove = header.next;
            item = nodeToRemove.value;
            header.next = nodeToRemove.next;
            //nodeToRemove.previous.next = nodeToRemove.next;
        }
        return item;
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

    public boolean isEmpty() {
        return header.next == null;
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
        list.addFirst("A");
        list.addFirst("B");
        list.addFirst("C");
        list.remove("B");
        list.printNodes();
    }
}


