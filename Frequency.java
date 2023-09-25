import java.util.*;

public class Frequency {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 2, 3, 5, 6, 1 };

        // Step 1: Sort the array (optional, but makes it easier to count duplicates)
        Arrays.sort(array);

        // Step 2: Find the second number with frequency 2
        int secondNumber = -1;
        int count = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                count++;
            } else {
                if (count == 2) {
                    secondNumber = array[i - 1];
                    break;
                }
                count = 1;
            }
        }

        // Check if the last number is the second number with frequency 2
        if (count == 2) {
            secondNumber = array[array.length - 1];
        }

        // Step 3: Print the second number with frequency 2
        if (secondNumber != -1) {
            System.out.println("Second number with frequency 2: " + secondNumber);
        } else {
            System.out.println("No second number with frequency 2 found.");
        }
    }
}
