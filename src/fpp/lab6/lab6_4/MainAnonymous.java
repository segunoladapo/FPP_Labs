package fpp.lab6.lab6_4;
import java.util.Arrays;
import java.util.Comparator;

public class MainAnonymous {

    public MainAnonymous(String[] strArr) {

        StringSort sortVar = new StringSort(new Comparator<String>() {
            public int compare(String arg0, String arg1) {

                if (arg0.length() == arg1.length()) {
                    return 0;
                }

                if (arg0.length() < arg1.length()) {
                    return -1;
                }

                return 1;
            }
        });


        System.out.println(Arrays.toString(sortVar.stringSort(strArr)));
    }



}
