class Card {
    int value;
    String suit;
    String name;

    public String toString() {
        return name + " of " + suit;
    }
}

public class PickACard {
    public static void main(String[] args) {
        Card[] deck = buildDeck();
        // Uncomment the line below to view the full deck.
        shuffleDeck(deck);
        displayDeck(deck);

        int chosen = (int)(Math.random()*deck.length);
        Card picked = deck[chosen];

        System.out.println("You picked a " + picked + " out of the deck,");
        System.out.println("worth " + picked.value + " points in Blackjack.");
    }

    public static Card[] buildDeck() {
        String[] suits = {"clubs", "diamonds", "hearts", "spades"};
        String[] names = {"ZERO", "ONE", "two", "three", "four", "five", "six", "seven",
                            "eight", "nine", "ten", "Jack", "Queen", "King", "Ace"};

        int i = 0;
        Card[] deck = new Card[52];

        for (String s: suits) {
            for (int v = 2; v <= 14; v++) {
                Card c = new Card();
                c.suit = s;
                c.name = names[v];
                if ( v == 14)
                    c.value = 11;
                else if (v > 10)
                    c.value = 10;
                else
                    c.value = v;

                deck[i] = c;
                i++;
            }
        }
        return deck;
    }

    public static void displayDeck(Card[] deck) {
        for (Card c: deck)
            System.out.println(c.value + "\t" + c);
    }

    public static void shuffleDeck(Card[] deck) {
        int i = 0;
        for (i=0; i<100; i++) {
            int a = (int)(Math.random()*deck.length);
            int b = (int)(Math.random()*deck.length);

            Card c = deck[a];
            deck[a] = deck[b];
            deck[b] = c;
        }
    }
}
