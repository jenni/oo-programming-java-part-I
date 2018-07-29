//Create the method public static void combine(ArrayList<Integer> first, ArrayList<Integer> second)
// that inserts the items in a list called second to a list called first.

import java.util.ArrayList;
import java.util.Collections;

public class CombiningArrayLists {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        Collections.addAll(list1, 4, 3);
        Collections.addAll(list2, 5, 10, 7);

        combine(list1, list2);
        System.out.println(list1);
        System.out.println(list2);
    }

    public static void combine(
            ArrayList<Integer> first,
            ArrayList<Integer> second) {
        first.addAll(second);
    }

}
