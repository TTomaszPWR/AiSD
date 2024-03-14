package lab_list3;

import lab_list1.Card;
import lab_list1.FilterIterator;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class CardGame {
    private final OneWayLinkedListWithHead<Card> cards = new OneWayLinkedListWithHead<>();


    public void createArrayList() {
        cards.clear();
        Random generator = new Random();
        System.out.println("Tworzenie Arraylist...");
        while (true) {
            int value = generator.nextInt(15);
            int color = generator.nextInt(4);

            if (value == 0) break;
            else if(value==14) cards.add(new Card(generator.nextInt(13)+1,generator.nextInt(4)+1));
            else {
                Card newCard = new Card(value, color);

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
                        cards.addLast(newCard);
                        break;
                    }
                }
            }
        }
        //dodawanie asów na początku
        for(int i=0; i<3; i++){
            cards.addFirst(new lab_list1.Card(1,0));
        }
        System.out.println("Arraylist utworzona.");
    }

    public void displayAllCards() {
        if (cards.isEmpty()) {
            System.out.println("Arraylist jest pusta.");
        } else {
            System.out.println("Wszystkie karty w Arrayliście:");
            for (lab_list1.Card card : cards) {
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
        if(value>=1 && value<=13) {
            boolean isSearched=false;

            FilterIterator<lab_list1.Card> filterIterator = new FilterIterator<>(cards.iterator(), (card) -> card.getValue() == value);

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

            FilterIterator<lab_list1.Card> filterIterator = new FilterIterator<>(cards.iterator(), (card) -> card.getColor() == color);

            System.out.println("Karty o kolorze " + color + ":");
            while (filterIterator.hasNext()) {
                System.out.println(filterIterator.next());
                isSearched = true;
            }
            if(!isSearched) System.out.println("Nie znaleziono kart o podanym kolorze");
        }else System.out.println("Wprowadzono niepoprawną wartość. Powrócono do menu");
    }

    public void removeDuplicateCards() {
        ArrayList<lab_list1.Card> temp = new ArrayList<>();
        boolean isDuplicate = false;
        for (lab_list1.Card card: cards) {
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


