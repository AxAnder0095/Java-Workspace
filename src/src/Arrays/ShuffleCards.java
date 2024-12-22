// This program will shuffle an array of 52 cards 
package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class ShuffleCards {
    public static void main(String[] args) {
        String[] suites = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] values = {"Ace", "2" ,"3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        ArrayList<String> cards = new ArrayList<>();

        for (int i = 0; i < suites.length; i++) {
            for (int j = 0; j < values.length; j++) {
                cards.add(values[j] + " " + suites[i]);
            }
        }

        // Convert ArrayList to normal array
        String[] deck = new String[cards.size()];
        deck = cards.toArray(deck);

        // Display deck to console
        System.out.println(Arrays.toString(deck));

        // create random number object
        Random rand = new Random();

        // Shuffle deck
        for (int i = deck.length - 1; i > 0; i--) {
            int random = rand.nextInt(deck.length - 1); // get random number 0-51
            String temp = deck[random]; // store random index value into variable temp
            deck[random] = deck[i]; // set random index to the current length - 1
            deck[i] = temp; // set latest index at the back to the random index
        }

        System.out.println(Arrays.toString(deck));
    }
}
