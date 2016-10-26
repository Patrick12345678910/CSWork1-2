import java.util.Scanner;

public class greetings
{
    public static void greetings(String name, String location)
    {
        System.out.println("Greetings " + name + " from " + location);
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your name" );

        String name = input.nextLine();

        System.out.println("Please enter your location" );

        String location = input.nextLine();

        greetings(name,location);
    }
}
