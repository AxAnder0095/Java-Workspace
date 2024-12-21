// This program will shuffle an array of 52 cards with no duplicates
package Arrays;

import java.util.Arrays;
import java.util.Random;

public class ShuffleCards {
    public static void main(String[] args) {
        int[] deck = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Random rand = new Random();

        System.out.println(Arrays.toString(deck));


        for (int i = deck.length - 1; i > 0; i--) {
            int random = rand.nextInt(deck.length - 1);
            int temp = deck[random];
            deck[random] = deck[i];
            deck[i] = temp;
        }

        System.out.println(Arrays.toString(deck));
    }
}
