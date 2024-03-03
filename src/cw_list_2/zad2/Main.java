package cw_list_2.zad2;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        int startNumber = 5; // Przykładowa liczba początkowa
        Iterator<Integer> numberIterator = new NumberIterator(startNumber);

        for (int i = 0; i < 10; i++) { // Zakładamy pobranie 10 kolejnych liczb
            System.out.println(numberIterator.next());
        }

    }
}
