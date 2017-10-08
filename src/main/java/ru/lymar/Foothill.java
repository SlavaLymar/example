package ru.lymar;

public class Foothill {

    public static void main(String[] args) {
        Card[] cards = new Card[3];

        // correct cards
        cards[0] = new Card(Values.J.getValue(), Card.Suits.DIAMONDS.getCode());
        cards[1] = new Card(Values.C6.getValue(), Card.Suits.HEARTS.getCode());

        // illegal card
        cards[2] = new Card('1', Card.Suits.SPADES.getCode());

        String report = card1.toString();
        System.out.println(report);

        if (!card1.set('Q', Card.HEARTS))
            System.out.println("* illegal *");
        if (!card1.set('1', Card.HEARTS))
            System.out.println("* illegal *");
        String report2 = card2.toString();


        System.out.println(report2);

        card1 = card3;

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
