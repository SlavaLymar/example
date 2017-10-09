package ru.lymar;

import java.util.Arrays;

public class Foothill {

    public static void main(String[] args) {

        // 1. Create and print 3 cards
        Card[] cards = new Card[3];

        // correct cards
        cards[0] = new Card(Values.J.getValue(), Card.Suits.DIAMONDS.getCode());
        cards[1] = new Card(Values.C6.getValue(), Card.Suits.HEARTS.getCode());

        // illegal card
        cards[2] = new Card();

        Arrays.asList(cards).forEach(System.out::println);


        System.out.println();

        // 2. Create 5 cards
        Card[] cards1 = new Card[5];

        cards1[0] = new Card(Values.J.getValue(), Card.Suits.DIAMONDS.getCode());
        cards1[1] = new Card(Values.C6.getValue(), Card.Suits.HEARTS.getCode());
        cards1[2] = new Card(Values.Q.getValue(), Card.Suits.CLUBS.getCode());
        cards1[3] = new Card(Values.C2.getValue(), Card.Suits.CLUBS.getCode());
        cards1[4] = new Card(Values.A.getValue(), Card.Suits.HEARTS.getCode());


        // HAND
        final Hand hand = new Hand();

        // print 5 cards
        for (int i = 0; i < 2; i++) {
            hand.takeCard(cards1[i]);
            System.out.println(String.format("Add %s in hand", cards1[i]));
        }

        // play card
        System.out.println(String.format("Play card: %s", hand.playCard()));

        // add 3 cards to hand
        for (int i = 2; i < cards1.length; i++) {
            hand.takeCard(cards1[i]);
            System.out.println(String.format("Add %s in hand", cards1[i]));
        }

        // print hand
        System.out.println("Print hand:");
        for (Card card : hand.getMyCards()) {
            if (card == null) break;
            System.out.println(card);
        }

        // play hand
        while (hand.getNumbCard() != 0) {
            System.out.println(String.format("Play card: %s", hand.playCard()));
        }
    }
}

/* -------------------------------------Sample-----------------------------------------

A of Spades
 * illegal *
A of Clubs

A of Spades
 * illegal *
 * illegal *
A of Clubs

A of Spades
 * illegal *
J of Clubs

------------------------------------------------------------------------------------ */
