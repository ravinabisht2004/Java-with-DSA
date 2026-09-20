package First_Program;

import java.util.Scanner;

public class SwitchStatement {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //--> Day Finder

       /*System.out.print("Enter number from 1 to 7 => ");
        int day = input.nextInt();

        switch(day){

            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Enter valid number from 1 to 7");

        }*/

        //--> Simple Calculator

       /*  System.out.print("Enter the operator => ");
        char operator = input.next().trim().charAt(0);


        System.out.print("Enter two number => ");
        
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();

        switch(operator){

    case '+' -> System.out.println(num1 + num2);
    case '-' -> System.out.println(num1 - num2);
    case '*' -> System.out.println(num1 * num2);
    case '/' -> {
        if (num2 == 0) {
            System.out.println("Cannot divide by zero");
        } else {
            System.out.println(num1 / num2);
        }
    }
    default -> System.out.println("Please enter valid operator");
}*/

        
        //--> Month & Days

        /*System.out.println("Enter 1 to 12 number: ");    

        System.out.print("Enter month number: ");    
        int monthNum = input.nextInt();

        switch(monthNum){
            case 1 -> System.out.println("Month - January & Days - 31");
            case 2 -> System.out.println("Month - February & Days - 28");
            case 3 -> System.out.println("Month - March & Days - 31");
            case 4 -> System.out.println("Month - April & Days - 30");
            case 5 -> System.out.println("Month - May & Days - 31");
            case 6 -> System.out.println("Month - June & Days - 30");
            case 7 -> System.out.println("Month - July & Days - 31");
            case 8 -> System.out.println("Month - August & Days - 31");
            case 9 -> System.out.println("Month - September & Days - 30");
            case 10 -> System.out.println("Month - October & Days - 31");
            case 11 -> System.out.println("Month - November & Days - 30");
            case 12 -> System.out.println("Month - December & Days - 31");
            default -> System.out.println("Invalid number. Enter a number from 1 to 12");
            
        }*/

         //--ATM Menu
         
        /*  System.out.println("Welcome - ATM");
         System.out.println("1. Check Balance");
         System.out.println("2. Deposit");
         System.out.println("3. Withdraw");
         System.out.println("4. Exit");

         int balance = 5000;

         System.out.print("Enter your choice:");
         int choice = input.nextInt();

         


         switch(choice){

            case 1 -> System.out.println("Balance : " + balance);
            case 2 -> {
                    System.out.print("Enter amount:");
                    int amount = input.nextInt();
                    System.out.println("Update Balance : " + (balance + amount));
                    }
            case 3 -> {
                System.out.print("Enter amount:");
                int amount = input.nextInt();
                if (amount > balance){
                System.out.println("Insufficient Balance");
                }
                else{
                System.out.println("Update Balance : " + (balance - amount));
            }}
            
            case 4 -> System.out.println("Thank You");

            default -> System.out.println("Invalid Choice");


         }*/

        //--- Traffic Light

       /*  System.out.print("Enter traffic light: ");

        String light = input.next().toLowerCase();
        System.out.print("Output :- ");

        switch(light){
            
            case "red"      -> System.out.println("Stop");
            case "yellow"   -> System.out.println("Wait");
            case "green"    -> System.out.println("Go");
            
            default         -> System.out.println("Invalid traffic light");

        }*/

    }
    
}
