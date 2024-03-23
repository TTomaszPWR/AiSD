package cw_list_3.zad1;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Iterator<Integer> iterator = list.iterator();


        System.out.println(iterator.next());
        iterator.remove();
        System.out.println(iterator.next());
        iterator.remove();
    }
}
