import java.util.Scanner;

public class StringLength
{
    public static void StringLength()
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your name");

        String name = input.nextLine();

        int length = name.length( );

        System.out.println("Your name is " + length + " characters long");

    }

}
