import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Task 1: Create an array and shuffle it
        Integer[] array = {1, 2, 3, 4, 5, 6, 7};
        List<Integer> list = Arrays.asList(array);
        Collections.shuffle(list);
        System.out.println("Shuffled Array: " + list);

        // Task 2: Convert Roman numeral to integer
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine().trim().toUpperCase();
        int intValue = convertRomanToInteger(romanNumeral);
        System.out.println("Integer value of " + romanNumeral + " is: " + intValue);

        // Task 3: Check if input is a pangram
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine().toLowerCase();
        boolean isPangram = isPangram(sentence);
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    // Function to convert Roman numeral to integer
    public static int convertRomanToInteger(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int currentVal = getRomanValue(s.charAt(i));
            if (i < s.length() - 1) {
                int nextVal = getRomanValue(s.charAt(i + 1));
                if (currentVal < nextVal) {
                    result -= currentVal;
                } else {
                    result += currentVal;
                }
            } else {
                result += currentVal;
            }
        }
        return result;
    }

    public static int getRomanValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    // Function to check if a sentence is a pangram
    public static boolean isPangram(String sentence) {
        boolean[] alphabet = new boolean[26];
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (Character.isLetter(c)) {
                int index = c - 'a';
                alphabet[index] = true;
            }
        }
        for (boolean b : alphabet) {
            if (!b) {
                return false;
            }
        }
        return true;
    }
}
