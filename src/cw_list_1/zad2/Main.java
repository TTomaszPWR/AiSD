package cw_list_1.zad2;

public class Main {
    public static void main(String[] args) throws Exception {
        int[] exampleArray = {1,2,1,2,1,2};
        System.out.print(getSecondSmallest(exampleArray));
    }
    private static int getSecondSmallest(int[] array) throws Exception {
        if (array.length < 2) {
            throw new Exception("NoAnswearException");
        }
        int smallest = array[0], secondSmallest = array[1];

        for (int num : array) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }

        if(secondSmallest == smallest){
            throw new Exception("NoAnswearException");
        }

        return secondSmallest;
    }
}
