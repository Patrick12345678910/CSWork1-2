
import java.util.Scanner;
public class passVerify
{   
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("please enter your password");
        
        String pass1 = input.nextLine();
        
        System.out.println("please enter your password again");
        
        String pass2 = input.nextLine();
        
        if (pass1.equals(pass2)) {
            System.out.println("Password Verified");
        }else{
            System.out.println("please enter your password");
        
            String pass3 = input.nextLine();
            pass1 = pass3;
        
            System.out.println("please enter your password again");
        
            String pass4 = input.nextLine();
            pass2 = pass4;
        }
            
        
    }
}
