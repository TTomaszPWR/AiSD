package lab_list1;

public class Card {
    private final int value;
    private final int color;

    public Card(int value, int color) {
        this.value = value;
        this.color = color;
    }

    public int getValue() {
        return value;
    }

    public int getColor() {
        return color;
    }

    @Override
    public String toString() {
        String[] colors = {"Kier", "Karo", "Trefl", "Pik"};
        String[] values = {null, "As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Walet", "Dama", "Król"};
        return values[value] + " " + colors[color];
    }

}
