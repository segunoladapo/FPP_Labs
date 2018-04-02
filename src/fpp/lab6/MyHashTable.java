package fpp.lab6;

/**
 *
 * @author Segun.Oladapo
 */
public class MyHashTable {

    private Entry[] entries = new Entry[26];

    private class Entry {

        private char key;
        private String value;

        Entry(char key, String value) {
            this.key = key;
            this.value = value;

        }

        public String toString() {
            return this.key + " -> " + this.value;
        }

        public String getValue(){
            return this.value;
        }
    }

    public void add(char key, String value) {
        int index = (int) key - 97;
        Entry entry = new Entry(key, value);
        entries[index] = entry;
    }

    public String get(char key) {
        int index = (int) key - 97;
        Entry entry = entries[index];
        if (entry == null) {
            return null;
        }
        return entry.getValue();
    }

    public String toString() {
        String toPrint = "";
        int N = entries.length - 1;
        int index = 0;
        while ( index <= N) {
            if (entries[index] != null) {
                toPrint += entries[index].toString();
                toPrint += "\n";
            }
            index++;
        }
        return toPrint;
    }

    public  static void main(String... args){
        MyHashTable myHashTable = new MyHashTable();
        myHashTable.add('a',"Apple");
        myHashTable.add('b',"ball");
        myHashTable.add('c',"cat");
        System.out.println(myHashTable);
    }

}
