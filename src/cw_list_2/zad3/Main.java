package cw_list_2.zad3;

public class Main {
    public static void main(String[] args) {
        FibonacciIterator fibonacciIterator = new FibonacciIterator();

        for (int i = 0; i < 10; i++) {
            System.out.println(fibonacciIterator.next());
        }
    }
}
