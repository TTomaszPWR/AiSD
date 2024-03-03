package cw_list_2.zad4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(11, 12, 13));
        Iterator<Integer> iter1 = list1.iterator();
        Iterator<Integer> ite21 = list2.iterator();
        ShuffleIterator<Integer> shuffleIterator = new ShuffleIterator<>(iter1, ite21);

        while (shuffleIterator.hasNext()) {
            System.out.println(shuffleIterator.next());
        }
    }
}
