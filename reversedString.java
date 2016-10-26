import java.util.Scanner;
import java.util.*;
public class reversedString
{
    public static void main(String[ ] args) {
        Scanner in = new Scanner(System.in);
        String original, reverse = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string");
        original = in.nextLine();
        String Rstring = input.nextLine();
        int length = original.length();
      for ( int i = length - 1 ; i >= 0 ; i-- )
         Rstring = Rstring + original.charAt(i);
         System.out.println("Reverse of entered string is: "+Rstring);
    }
}