package lab_list3;

public class Card {
    private final int value;
    private final int color;
    private boolean isRevealed;

    public Card(int value, int color, boolean isRevealed) {
        this.value = value;
        this.color = color;
        this.isRevealed = isRevealed;
    }

    public int getValue() {
        return value;
    }

    public int getColor() {
        return color;
    }

    public boolean isRevealed() {
        return isRevealed;
    }
    @Override
    public String toString() {
        String[] colors = {"Kier", "Karo", "Trefl", "Pik"};
        String[] values = {null, "As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Walet", "Dama", "Król"};
        return isRevealed? values[value] + " " + colors[color]+ " " : "()";

    }

}
