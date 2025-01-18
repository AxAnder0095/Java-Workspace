package BlackJack;

import java.util.ArrayList;
import java.util.Arrays;

public class BlackJack {
    public static void main(String[] args) {
        ArrayList<String> deck = createDeck();
        System.out.println(Arrays.toString(deck.toArray()));
    }

    private static ArrayList<String> createDeck() {
        // Create two arrays that hold the suites and values
        String[] suites = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] values = {"Ace", "2" ,"3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        // Create new arraylist for holding the 52 card deck
        ArrayList<String> cards = new ArrayList<>();

        for (int i = 0; i < suites.length; i++) {
            for (int j = 0; j < values.length; j++) {
                cards.add(values[j] + " " + suites[i]);
            }
        }

        return cards;
    }
}
