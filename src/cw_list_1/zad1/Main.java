package cw_list_1.zad1;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] example = new int[] {1};
        printPascalTriangle(example, 8);
    }
    private static int[] nextPascalLine(int[] T) {
        int[] wyn =new int[T.length+1];
        wyn[0]=1;
        wyn[T.length]=1;
        for(int i=1; i<T.length; i++){
            wyn[i]=T[i-1]+T[i];
        }
        return wyn;
    }
    private static void printPascalTriangle(int[] startArray, int depth){
        printArray(startArray);
        int[] newArray = nextPascalLine(startArray);
        for(int i=0; i<depth; i++){
            printArray(newArray);
            newArray = nextPascalLine(newArray);
        }
    }

    private static void printArray(int[] array){
        for(int element: array) System.out.print(element + " ");
        System.out.println();
    }
}