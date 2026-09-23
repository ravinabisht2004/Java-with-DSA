package First_Program.PIN_Security_Checker;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        
        Scanner input =  new Scanner(System.in);

        //-- Correct Pin 

        int correctPin = 1234;

        //-- Count 
        int count = 3;

        boolean accessGranted = false;

       

        while (count > 0) {

             //-- taking PIN input 

            System.out.print("Enter your PIN : ");
            int pin = input.nextInt();

            if (pin == correctPin){
                System.out.println("PIN Correct");
                System.out.println("Access Granted");
                
                accessGranted = true;

                break;
                
            }else{
                System.out.println("Incorrect PIN");
                count--;
                System.out.println("Attempts remaining : " + (count));
            }

            
        }

       if (!accessGranted) {
            System.out.println("Account Locked");
        }





    }
    
}
