package lab_list1;

import java.util.*;

public class CardGame {
    private final ArrayList<Card> cards = new ArrayList<Card>();

    public void createArrayList() {
        cards.clear();
        Random random = new Random();
        System.out.println("Tworzenie Arraylist...");
        while (true) {
            int value = random.nextInt(14);
            int suit = random.nextInt(4);

            if (value == 0) break;

            Card newCard = new Card(value, suit);

            if(cards.isEmpty()) {
                cards.add(newCard);
            }
            else if(cards.size() == 1) {
                if(newCard.getValue() >= cards.getFirst().getValue()) {
                    cards.add(newCard);
                } else {
                    cards.addFirst(newCard);
                }
            }
            else for (int i = 0; i < cards.size(); i++) {
                if (newCard.getValue() < cards.get(i).getValue()) {
                    cards.add(i, newCard);
                    break;
                }
                else if (newCard.getValue() == cards.get(i).getValue()) {
                    while (newCard.getColor()>cards.get(i).getColor() && newCard.getValue()==cards.get(i).getValue() && i<cards.size()-1){
                        i++;
                    }
                    if(i==cards.size()-1) continue;
                    else {
                        cards.add(i, newCard);
                        break;
                    }
                }
                if(i== cards.size()-1){
                    cards.addLast(newCard);
                    break;
                }
            }
        }
        for(int i=0; i<3; i++){
            cards.addFirst(new Card(1,0));
        }
        System.out.println("Arraylist utworzona.");
    }

    public void displayAllCards() {
        if (cards.isEmpty()) {
            System.out.println("Arraylist jest pusta.");
        } else {
            System.out.println("Wszystkie karty w Arrayliście:");
            for (Card card : cards) {
                System.out.println(card);
            }
        }
    }

    public void displayNumberOfCards() {
        System.out.println("Liczba kart w Arrayliście: " + cards.size());
    }

    public void displayCardsByValue(Scanner scanner) {
        System.out.print("Podaj wartość karty (1-13): ");
        int value = scanner.nextInt();
        System.out.println("Karty o wartości " + value + ":");
        for (Card card : cards) {
            if (card.getValue() == value) {
                System.out.println(card);
            }
        }
    }

    public void displayCardsByColor(Scanner scanner) {
        System.out.print("Podaj kolor karty (0-3): ");
        int color = scanner.nextInt();
        System.out.println("Karty o kolorze " + color + ":");
        for (Card card : cards) {
            if (card.getColor() == color) System.out.println(card);
        }
    }

    public void removeDuplicateCards() {
        ArrayList<Card> temp = new ArrayList<Card>();
        boolean isDuplicate = false;
        for (Card card: cards) {
            for(Card card2: temp){
                if(card.getValue() == card2.getValue() && card.getColor() == card2.getColor()){
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate) temp.add(card);
            isDuplicate = false;
        }
        cards.clear();
        cards.addAll(temp);
    }
}

