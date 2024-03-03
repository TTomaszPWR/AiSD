package cw_list_2.zad1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        Iterator<Integer> baseIterator = list.iterator();
        int k = 4;
        Iterator<Integer> kthIterator = new KthElementIterator<>(baseIterator, k);

        while (kthIterator.hasNext()) {
            System.out.println(kthIterator.next());
        }
    }
}


