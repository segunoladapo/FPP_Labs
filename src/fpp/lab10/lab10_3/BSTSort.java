package fpp.lab10.lab10_3;

/**
 * Created by segun on 3/18/2018.
 */
public class BSTSort extends Sorter {
    MyBST bstSort = new MyBST();

    public int[] sort(int[] array) {
        for(int element : array)
            bstSort.insert(element);
         bstSort.printAsDiagram();
         return new int[]{};
    }

}
