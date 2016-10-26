
import java.util.Scanner;
public class postCode
{
    public static void postCode(String postCode)
    {
       System.out.println("Your postcode is "+ postCode.toUpperCase());
    }
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your postcode");
        String postCode = input.nextLine();
        postCode(postCode);
    }
}
