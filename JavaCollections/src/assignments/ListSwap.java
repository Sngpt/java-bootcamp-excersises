package assignments;

/*
Write a method that accepts a list and two position ints and swaps the elements in the two positions
The method should be generic and accept any List
*/

import java.util.ArrayList;
import java.util.List;

public class ListSwap<E> {

     void swap(List<E> l, int pos1, int pos2) {

        E ele1 = l.get(pos1);
        E ele2 = l.get(pos2);
        l.remove(pos1);
        l.remove(pos2-1);
        l.add(pos1,ele2);
        l.add(pos2,ele1);
    }

    public static void main(String[] args) {

        List<Integer> l = new ArrayList<Integer>(List.of(1,2,5,4,3));

        ListSwap obj = new ListSwap();
        obj.swap(l,2,4);
        System.out.println(l);
    }
}
