package assignments;
/*
Print the list in forward and reverse order using iterators only
*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListIteratorExercise {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Item 1");
        list.add("Item 2");
        list.add("Item 3");
        list.add("Item 4");
        list.add("Item 5");

        ListIterator iterator = list.listIterator();

        System.out.println("Printing in forward order:");
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Printing in reverse order:");
        while(iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }


    }
}