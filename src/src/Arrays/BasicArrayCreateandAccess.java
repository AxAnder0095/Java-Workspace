package Arrays;

import java.util.ArrayList;

public class BasicArrayCreateandAccess {
    public static void main(String[] args) {
        // array with already stored values
       int[] num1 = {1, 2, 3, 4, 5};

       for (int i : num1) {
           System.out.println(i);
       }

       // create an array with a size of five indexes
       int[] num2 = new int[5];
       num2[0] = 1;
       num2[1] = 2;
       num2[2] = 3;
       num2[3] = 4;
       num2[4] = 5;

       for (int i : num2) {
           System.out.println(i);
       }

    }
}
