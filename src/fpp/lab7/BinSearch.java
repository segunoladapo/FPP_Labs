package fpp.lab7;

public class BinSearch {

    public boolean search(String str, char a) {
        if (str.length() == 0)
            return false;
        int mid = str.length() / 2;
        char midElement = str.charAt(mid);
        if(midElement == a)
            return true;
        if (midElement > a) {
            return search(str.substring(0, mid), a);
        }
        if (midElement < a) {
            return search(str.substring(mid + 1), a);
        }
       return false;
    }

    public static void main(String[] args) {
        BinSearch binSearch = new BinSearch();
        boolean found = binSearch.search("abcdef", 'n');
        System.out.println("Is C found: " + found);
    }
}
