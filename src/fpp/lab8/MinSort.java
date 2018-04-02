package fpp.lab8;

import java.util.Arrays;

public class MinSort {
    String[] arr;

    MinSort(String[] arr) {
        this.arr = arr;
    }

    public void sort() {
        if (arr == null || arr.length <= 1) return;
        int len = arr.length;
        int temp = 0;
        for (int i = 0; i < len; ++i) {
            int nextMinPos = minpos(i, len - 1);
            swap(i, nextMinPos);
        }
    }

    void swap(int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    int search(String str) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (str.equals(arr[i])) {
                index = i;
                return index;
            }
        }
        return index;
    }

    //find minimum of arr between the indices bottom and top
    public int minpos(int bottom, int top) {
        String m = arr[bottom];
        int index = bottom;
        for (int i = bottom + 1; i <= top; ++i) {
            if (arr[i].compareTo(m) < 0) {
                m = arr[i];
                index = i;
            }
        }
        //return location of min, not the min itself
        return index;
    }

    public static void main(String[] args) {
        int[] test = {21, 13, 1, -22, 51, 5, 18};
        //	SelSort ss = new SelSort(test);
        //	ss.sort();
        //	System.out.println(Arrays.toString(ss.arr));

        MinSort minSort = new MinSort(new String[]{"big", "small", "tall", "short", "round", "square",
                "enormous", "tiny", "gargantuan", "lilliputian",
                "numberless", "none", "vast", "miniscule" });
        minSort.sort();
        for (String element : minSort.arr) {
            System.out.println(element);
        }
    }
}