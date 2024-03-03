package cw_list_2.zad6;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5};
        ArrayIterator<Integer> iterator = new ArrayIterator<>(arr);

        System.out.println(iterator.next());
        System.out.println(iterator.next());
        iterator.remove();
        System.out.println(iterator.next());
        System.out.println(iterator.next());

    }
}
