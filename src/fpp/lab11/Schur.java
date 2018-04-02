package fpp.lab11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Schur {

    public  boolean checkForSum(List<Integer> list, int z) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer x : list) {
            map.put(x, x);
            if (map.containsKey(Math.abs(z - x))) return true;
        }
        return false;
    }

    public static void main(String... args){
        Schur schur = new Schur();
        List<Integer> lists = new ArrayList<>();
        lists.add(5);
        lists.add(4);
        lists.add(8);
        lists.add(6);
        /* x - y = z */
        System.out.println(schur.checkForSum(lists,4 ));
    }
}
