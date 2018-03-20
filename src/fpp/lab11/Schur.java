package fpp.lab11;

import java.util.HashMap;
import java.util.List;

public class Schur {
    HashMap<Integer, Integer> map = new HashMap<>();

    public boolean checkForSum(List<Integer> list, int z) {
        for (Integer x : list) {
            map.put(x, x);
            if (map.containsKey(z - x)) return true;
        }
        return false;
    }
}
