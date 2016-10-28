
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class lotteryGame
{
    public static void main (String[ ] args) {
        Scanner input = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to the Lottery Game, please enter a number between 1 and 49 after each prompt, please enter the first number now ");
        int Value1 = input.nextInt();
        try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e6) {
			// TODO Auto-generated catch block
			e6.printStackTrace();
		}
        System.out.println("Enter the second number");
        int Value2 = input.nextInt();
        try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e5) {
			// TODO Auto-generated catch block
			e5.printStackTrace();
		}
        System.out.println("Enter the third number");
        int Value3 = input.nextInt();
        try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e4) {
			// TODO Auto-generated catch block
			e4.printStackTrace();
		}
        System.out.println("Enter the fourth number");
        int Value4 = input.nextInt();
        try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}
        System.out.println("Enter the fifth number");
        int Value5 = input.nextInt();
        try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
        System.out.println("Enter the sixth number");
        int Value6 = input.nextInt();
        try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        System.out.println("Enter the seventh number");
        int Value7 = input.nextInt();
        try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("Calculating");
        Random random = new Random();
        int lottValue1 = random.nextInt(49) + 1;
        int lottValue2 = random.nextInt(49) + 1;
        int lottValue3 = random.nextInt(49) + 1;
        int lottValue4 = random.nextInt(49) + 1;
        int lottValue5 = random.nextInt(49) + 1;
        int lottValue6 = random.nextInt(49) + 1;
        int lottValue7 = random.nextInt(49) + 1;
        
        if 
        	(Value1 == lottValue1); or (Value1 == lottValue2); or (Value1 == lottValue3); or (Value1 == lottValue4); or (Value1 == lottValue5); or (Value1 == lottValue6); or (Value1 == lottValue7);
        
        	 
        	 
        	
        	
        }

	private static void or(boolean b) {
		// TODO Auto-generated method stub
		
	}

        
        	
        
    }
}	