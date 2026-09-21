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




        //-- Student Grade

       /*  System.out.print("Enter grade : ");
        char grade = input.next().trim().toUpperCase().charAt(0);

        System.out.print("Output : ");

        switch(grade){

            case 'A' -> System.out.println("Excellent");
            case 'B' -> System.out.println("Very Good");
            case 'C' -> System.out.println("Good");
            case 'D' -> System.out.println("Need Improvement");
            case 'F' -> System.out.println("Fail");

            default -> System.out.println("Invalid Grade");
        }*/

        //--- Electricity Bill Calculator

        /*System.out.println("1 -> 0 - 100 units -> 5 per unit");
        System.out.println("2 -> 101 - 200 units -> 7 per unit");
        System.out.println("3 -> 201 - 300 units -> 10 per unit");
        System.out.println("4 -> 300+ units -> 15 per unit");


        System.out.print("Enter slab number : ");
        int slab = input.nextInt();

        System.out.print("Enter units : ");
        int unit = input.nextInt();
        int output;

        System.out.print("Output : ");

        switch(slab){
            case 1 -> {
                 if (unit >= 0  && unit <= 100){
                    output = unit * 5;
                    System.out.println(output);
                 } else {
                    System.out.println("Invalid units for slab 1");
                 }
            }

            case 2 -> {
                 if (unit >= 101 && unit <= 200){
                    output = unit * 7;
                    System.out.println(output);
                 }else {
                    System.out.println("Invalid units for slab 2");
                 }
            }

            case 3 -> {
                 if (unit >= 201 && unit <= 300){
                    output = unit * 10;
                    System.out.println(output);
                 }else {
                    System.out.println("Invalid units for slab 3");
                 }
            }

            case 4 -> {
                 if (unit > 300){
                    output = unit * 15;
                    System.out.println(output);
                 }else {
                    System.out.println("Invalid units for slab 4");
                 }

            }

            default -> System.out.println("Invalid slab");
        }*/


        //--> Vehicle Type & Fare

        /*System.out.println("1 -> Bike -> 10/km");
        System.out.println("2 -> Auto -> 15/km");
        System.out.println("3 -> Car  -> 25/km");
        System.out.println("4 -> SUV  -> 35/km");

        System.out.print("Enter vehicle type : ");
        int vehicelType = input.nextInt();

        System.out.print("Enter distance : ");
        int distance = input.nextInt();

        System.out.print("Total Fare : ");

        if(distance <= 0){
            System.out.println("Invalid Distance");
        }else{

        switch(vehicelType){

            case 1 -> System.out.println(10 * distance);
            case 2 -> System.out.println(15 * distance);
            case 3 -> System.out.println(25 * distance);
            case 4 -> System.out.println(35 * distance);

            default -> System.out.println("Invalid vehicle type");

        }
        }*/

        //---> Food Order 🍔

        


        





    }
    
}
