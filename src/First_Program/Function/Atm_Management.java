package First_Program.Function;

import java.util.Scanner;

public class Atm_Management {

    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        int balance = 0;

        checkBalance(balance);

        

        System.out.print("Enter Deposit Amount : ");
        int depositAmt = input.nextInt();    
        balance = deposit(balance, depositAmt);
        System.out.println("Total Balance : " + balance);

        System.out.print("Enter your withdraw amount : ");
        int withdrawAmt = input.nextInt();


        if (balance < withdrawAmt || withdrawAmt < 0 || balance <= 0){
            
            System.out.println("Insuffient balance");

        }else {

           
             balance = withdraw(balance, withdrawAmt);
             System.out.print("Total Balance : " + balance);

            
        }


       
        input.close();

    };

    static void checkBalance (int balance){

        System.out.println("Your balance is : " + balance);

    };

    static int deposit (int balance, int amount){

        balance = amount + balance;

        return balance;


    }

    static int withdraw (int balance, int amount){


        balance = balance - amount;
        

        return balance;
    }


};