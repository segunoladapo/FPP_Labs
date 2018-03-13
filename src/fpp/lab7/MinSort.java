package fpp.lab7;

public class MinSort {
    public String sort(String x) {
        if ((x == null) || (x == ""))
            return "";

        if (x.length() == 1)
            return x;

        Character leftMin = rmin(x);
        if (x.indexOf(leftMin) != x.length()) {
            x = x.substring(0, x.indexOf(leftMin)) + x.substring(x.indexOf(leftMin) + 1);
        } else {
            x = x.substring(0, x.indexOf(leftMin));
        }

        return leftMin.toString() + sort(x);
    }

    public Character rmin(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        char ch = str.charAt(0);
        if (str.length() == 1)
            return ch;
        char c = rmin(str.substring(1));
        return (ch < c ? ch : c);
    }

}
