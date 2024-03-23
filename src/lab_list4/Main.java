package lab_list4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //sprawdzanie czy nawiasy są zbalansowane
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wyrażenie do sprawdzenia: ");
        String expression = scanner.nextLine();
        System.out.println(Brackets.isBalancedBrackets(expression));

        //sprawdzanie palindromu
        System.out.println("Podaj wyrażenie do sprawdzenia czy jest palindromem: ");
        String palindrom = scanner.nextLine();
        System.out.println(Palindrome.isPalindrome(palindrom));

        //przenoszenie na stos z zachowaniem kolejności
        ArrayStack<Integer> s1 = new ArrayStack<>();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(5);
        ArrayStack<Integer> reversedStack = s1.reverse();
        ArrayStack<Integer> s2 = new ArrayStack<>();
        while (!reversedStack.isEmpty()) {
            s2.push(reversedStack.pop());
        }
        while (!s2.isEmpty()) {
            System.out.println(s2.pop());
        }
    }
}