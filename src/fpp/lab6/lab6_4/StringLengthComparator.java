package fpp.lab6.lab6_4;
import java.util.Comparator;

public class StringLengthComparator implements Comparator<String>{

    //@Override
    public int compare(String arg0, String arg1) {

        if(arg0.length()==arg1.length()) {
            return 0;
        }

        if(arg0.length()<arg1.length()) {
            return -1;
        }

        return 1;
    }

}