package ru.lymar;

import java.util.ArrayList;
import java.util.List;

public class Card {

    // private data
    private char value;
    private int suit;
    private boolean errorFlag;

    // constructor
    public Card(char value, int suit) {
        this.errorFlag = this.set(value, suit);
    }

    // mutator
    public boolean set(char value, int suit) {
        if (!isValid(value, suit)) {
            this.value = Values.A.getValue();
            this.suit = Suits.CLUBS.getCode();
            return true;
        } else {
            this.value = value;
            this.suit = suit;
            return false;
        }
    }

    private static boolean isValid(char value, int suit) {
        return Values.getValues().contains(value) &&
                Suits.getSuits().contains(suit);
    }

    // accessors
    public char getValue() {
        return value;
    }

    public void setValue(char value) {
        this.value = value;
    }

    public int getSuit() {
        return suit;
    }

    public void setSuit(int suit) {
        this.suit = suit;
    }

    public boolean isErrorFlag() {
        return errorFlag;
    }

    public void setErrorFlag(boolean errorFlag) {
        this.errorFlag = errorFlag;
    }

    public String toString() {
        if (this.errorFlag) {
            return "** illegal **";
        } else {
            return String.format("%s of %s", this.value, this.suit);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Card card = (Card) o;

        if (value != card.value) return false;
        if (suit != card.suit) return false;
        return errorFlag == card.errorFlag;
    }

    @Override
    public int hashCode() {
        int result = (int) value;
        result = 31 * result + suit;
        result = 31 * result + (errorFlag ? 1 : 0);
        return result;
    }

    enum Suits {

        // constants (for suits) as unicode
        SPADES(2660),
        HEARTS(2665),
        DIAMONDS(2666),
        CLUBS(2663);

        int code;

        Suits(int code) {
            this.code = code;
        }

        public int getCode() {
            return code;
        }

        public static List<Integer> getSuits() {
            return new ArrayList<Integer>() {{
                for (Suits suit : values()) {
                    add(suit.code);
                }
            }};
        }
    }
}
