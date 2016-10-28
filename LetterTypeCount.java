import java.util.Scanner;
import java.util.*;
 
public class LetterTypeCount {
 
    private Scanner scan = new Scanner(System.in);
    private char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
    private char[] consonants = { 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z' };
    private int vowelCount, consonantCount;
 
    public LetterTypeCount() {
        System.out.println("Enter a string to calculate number of vowels and consonants:");
        countLetterTypes(scan.nextLine());
    }
 
    private void countLetterTypes(String text) {
        // Loop through each letter of text
        for (int i = 0; i < text.length(); i++) {
           
            // Find vowels
            for (int v = 0; v < vowels.length; v++) {
                if (text.charAt(i) == vowels[v]) vowelCount++;
            }
 
            // Find consonants
            for (int c = 0; c < consonants.length; c++) {
                if (text.charAt(i) == consonants[c]) consonantCount++;
            }
 
        }
 
        System.out.println("Vowels: " + vowelCount + "\nConsonants: " + consonantCount + "\nTotal: " + (vowelCount + consonantCount));
    }
 
    public static void main(String[] args) {
        new LetterTypeCount();
    }
 
}