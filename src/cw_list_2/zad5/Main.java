package cw_list_2.zad5;

public class Main {
    public static void main(String[] args) {
        PrimeNumberIterator iterator = new PrimeNumberIterator();
        for(int i = 0; i < 10; i++) {
            System.out.println(iterator.next());
        }
    }
}
