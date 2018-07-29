//Create the method smartCombine that works like the previous combine method
// except that numbers can be on the list only once.

import java.util.ArrayList;
import java.util.Collections;

public class SmartCombining {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        Collections.addAll(list1, 4, 3);
        Collections.addAll(list2, 5, 10, 4, 3, 7);

        smartCombine(list1, list2);
        System.out.println(list1);
        System.out.println(list2);
    }

    public static void smartCombine(
            ArrayList<Integer> first,
            ArrayList<Integer> second) {

        for (int num : second) {
            if (first.contains(num)) continue;
            first.add(num);
        }
    }
}
