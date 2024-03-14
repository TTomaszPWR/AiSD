package lab_list3;

import lab_list1.CardGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CardGame game = new CardGame();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Utworzenie listy");
            System.out.println("2. Wyświetlanie wszystkich elementów listy");
            System.out.println("3. Wyświetlanie liczby elementów listy");
            System.out.println("4. Wyświetlanie kart o podanej wartości");
            System.out.println("5. Wyświetlanie kart o podanym kolorze");
            System.out.println("6. Usuwanie kart zakrytych");
            System.out.println("0. Wyjście");
            System.out.print("Wybierz opcję: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline character

            switch (choice) {
                case 1:
                    game.createArrayList();
                    break;
                case 2:
                    game.displayAllCards();
                    break;
                case 3:
                    game.displayNumberOfCards();
                    break;
                case 4:
                    game.displayCardsByValue(scanner);
                    break;
                case 5:
                    game.displayCardsByColor(scanner);
                    break;
                case 6:
                    game.removeDuplicateCards();
                    break;
                case 0:
                    System.out.println("Koniec programu.");
                    break;
                default:
                    System.out.println("Nieprawidłowy wybór. Spróbuj ponownie.");
            }
        } while (choice != 0);

        scanner.close();
    }
}

