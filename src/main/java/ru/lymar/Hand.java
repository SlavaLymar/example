package ru.lymar;

import java.util.Arrays;

public class Hand {

    public static final int MAX_CARDS = 30;
    private final Card[] myCards;
    private int numbCard;

    public Hand() {
        this.myCards = new Card[MAX_CARDS];
        this.numbCard = 0;
    }

    public void resetHand() {
        Arrays.asList(this.myCards).forEach(c -> c = null);
    }

    public boolean takeCard(Card card) {
        if (this.numbCard == this.myCards.length - 1) return false;
        if (card.isErrorFlag()) return true;

        this.myCards[numbCard++] = card;
        return true;
    }

    public Card playCard() {
        Card card = null;
        if (this.numbCard > 0 && ( this.numbCard < this.myCards.length)) {
            card = this.myCards[numbCard - 1];
            this.myCards[numbCard - 1] = null;
            numbCard--;
        }
        return card;
    }

    @Override
    public String toString() {
        return "Hand{" +
                "myCards=" + Arrays.toString(myCards) +
                ", numbCard=" + numbCard +
                '}';
    }

//    public Card inspectCard(int k) {
//
//    }

    public int getNumbCard() {
        return numbCard;
    }

    public void setNumbCard(int numbCard) {
        this.numbCard = numbCard;
    }

    public Card[] getMyCards() {
        return myCards;
    }
}
