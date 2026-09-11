package First_Program;

import java.util.Scanner;

public class ATM_Menu {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        // System.out.print("Please Enter Amount => ");
        // double amt = input.nextDouble();

        // System.out.print("For withdraw please enter 'W' or For Deposit please enter 'D'  => ");
        // char withdep = input.next().trim().charAt(0);

        

        // double balance = 5000;
        // int count = 0;
        

        // while (balance > 0) {

        //     if(withdep == 'W'){
        //         if(balance >= amt){
        //             balance = balance - amt;                    
        //         }
        //         else{
        //         System.out.println("Not Suffient");   
        //         }
        //     }
        //     else if(withdep == 'D'){
        //        balance  = balance + amt;
        //     }
        //     else{
        //         System.out.println("Invalid Choice");   
        //     }

        //     System.out.println("Balance Amount => "+ balance);
        //     break;  

                       
        // }

       
        double balance = 5000;

        while (true) {

            System.out.println("\n--- ATM MENU ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");

            System.out.print("Enter your choice => ");
            int choice = input.nextInt();

            if (choice == 1) {

                System.out.println("Balance => " + balance);

            }
            else if (choice == 2) {

                System.out.print("Enter amount to withdraw => ");
                double amount = input.nextDouble();

                if (amount <= 0) {
                    System.out.println("Invalid Amount");
                }
                else if (balance >= amount) {
                    balance = balance - amount;
                    System.out.println("Withdrawal Successful");
                    System.out.println("Balance => " + balance);
                }
                else {
                    System.out.println("Not Sufficient Balance");
                }

            }
            else if (choice == 3) {

                System.out.print("Enter amount to deposit => ");
                double amount = input.nextDouble();

                if (amount <= 0) {
                    System.out.println("Invalid Amount");
                }
                else {
                    balance = balance + amount;
                    System.out.println("Deposit Successful");
                    System.out.println("Balance => " + balance);
                }

            }
            else if (choice == 4) {

                System.out.println("Thank you!");
                break;

            }
            else {

                System.out.println("Invalid Choice");

            }
        }



        



    }
    
}
