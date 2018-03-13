package fpp.lab8.lab6_4;
import java.util.Arrays;

public class MainLambda {

    public MainLambda(String[] strArr) {

        StringSort sortVar = new StringSort(
                // lambda
                (String arg0, String arg1) -> {

                    if (arg0.length() == arg1.length()) {
                        return 0;
                    }

                    if (arg0.length() < arg1.length()) {
                        return -1;
                    }

                    return 1;
                });

        System.out.println(Arrays.toString(sortVar.stringSort(strArr)));
    }

}
