package lab_list3;



import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;


public class CardGame {
    private final OneWayLinkedListWithHead<Card> cards = new OneWayLinkedListWithHead<>();
    private final boolean[] isInList = new boolean[52];

    public void createArrayList() {
        cards.clear();
        Arrays.fill(isInList, false);
        Random random = new Random();
        System.out.println("Tworzenie Arraylist...");
        while (true) {
            int value = random.nextInt(15);
            int color = random.nextInt(4);

            if (value == 0) break;
            else if (value == 14) {
                cards.add(new Card(value, color, false));
            } else {
                if (!isInList[(value - 1) * 4 + color]) {
                    isInList[(value - 1) * 4 + color] = true;
                    Card newCard = new Card(value, color, true);

                    if (cards.isEmpty()) {
                        cards.add(newCard);
                    } else if (cards.size() == 1) {
                        if (newCard.getValue() >= cards.getFirst().getValue()) {
                            cards.add(newCard);
                        } else {
                            cards.addFirst(newCard);
                        }
                    } else for (int i = 0; i < cards.size(); i++) {
                        if (newCard.getValue() < cards.get(i).getValue()) {
                            cards.add(i, newCard);
                            break;
                        } else if (newCard.getValue() == cards.get(i).getValue()) {
                            while (newCard.getColor() > cards.get(i).getColor() && newCard.getValue() == cards.get(i).getValue() && i < cards.size() - 1) {
                                i++;
                            }
                            if (i == cards.size() - 1) continue;
                            else {
                                cards.add(i, newCard);
                                break;
                            }
                        }
                        if (i == cards.size() - 1) {
                            cards.add(newCard);
                            break;
                        }
                    }
                }
            }

        }
    }


    public void displayAllCards() {
        if (cards.isEmpty()) {
            System.out.println("lista jest pusta.");
        } else {
            System.out.println("Wszystkie karty w liście:");
            for (Card card : cards) {
                System.out.println(card);
            }
        }
    }

    public void displayNumberOfCards() {
        int cardsRevealed = 0;
        int size = cards.size();
        System.out.println("Liczba kart w liście: " + size);

        for(Card card: cards){
            cardsRevealed += card.isRevealed() ? 1 : 0;
        }
        int cardsUnrevealed = size - cardsRevealed;
        System.out.println("Liczba odkrytych kart: " + cardsRevealed);
        System.out.println("Liczba zakrytych kart: " + cardsUnrevealed);
    }

    public void displayCardsByValue(Scanner scanner) {

        System.out.print("Podaj wartość karty (1-13): ");
        int value = scanner.nextInt();
        if(value>=1 && value<=13) {
            boolean isSearched=false;

            FilterIterator<Card> filterIterator = new FilterIterator<>(cards.iterator(), (card) -> card.getValue() == value);

            System.out.println("Karty o wartości " + value + ":");
            while (filterIterator.hasNext()) {
                System.out.println(filterIterator.next());
                isSearched = true;
            }
            if(!isSearched) System.out.println("Nie znaleziono kart o podanej wartości");
        }else System.out.println("Wprowadzono niepoprawną wartość. Powrócono do menu");
    }

    public void displayCardsByColor(Scanner scanner) {
        System.out.print("Podaj kolor karty (0-3): ");
        int color = scanner.nextInt();

        if(color>=0 && color<=3) {
            boolean isSearched = false;

            FilterIterator<Card> filterIterator = new FilterIterator<>(cards.iterator(), (card) -> card.getColor() == color);

            System.out.println("Karty o kolorze " + color + ":");
            while (filterIterator.hasNext()) {
                System.out.println(filterIterator.next());
                isSearched = true;
            }
            if(!isSearched) System.out.println("Nie znaleziono kart o podanym kolorze");
        }else System.out.println("Wprowadzono niepoprawną wartość. Powrócono do menu");
    }

    public void removeUnrevealedCards() {
        cards.removeIf(card -> !card.isRevealed());
    }

}


