//--------------------- Reverse a string----------------------

import java.util.*;

public class reverse {
    public static void main(String args[]) {
        String str = "Rajendra";
        int size = str.length();
        char[] charArray = str.toCharArray(); // Convert String to character array

        for (int i = 0, j = size - 1; i <= j; i++, j--) {
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
        }
        String reversed = new String(charArray); // Convert character array back to String
        System.out.println("Reversed String: " + reversed);
        
    }
}
