package cw_list_2.zad5;

import java.util.ArrayList;
import java.util.Iterator;

public class PrimeNumberIterator implements Iterator<Integer> {
    private final ArrayList<Integer> listOfDividers;
    int number;

    public PrimeNumberIterator() {
        this.number = 2;
        this.listOfDividers = new ArrayList<Integer>();
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        while (true) {
            boolean isPrime = true;
            for (int i = 0; i < listOfDividers.size(); i++) {
                if (number % listOfDividers.get(i) == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                listOfDividers.add(number);
                return number;
            }
            number++;
        }
    }
}
