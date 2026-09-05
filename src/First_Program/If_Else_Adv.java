package First_Program;

import java.util.Scanner;

public class If_Else_Adv {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        //--Leap Year

        // System.out.print("Enter Year => ");
        // int year = input.nextInt();

        // if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
        //     System.out.println("Leap Year");
        // }
        // else{
        //     System.out.println("Not a Leap Year");
        // }

        //--Three-Digit Number

        // System.out.print("Enter a number => ");
        // int number = input.nextInt();
        

        // if((number >= 100 && number <= 999) || (number <= -100 && number >= -999)){
        //     System.out.println("Three Digit Number");
        // }
        // else{
        //     System.out.print("Not Three Digit Number");
        // }


        //Discount Calculator

        // System.out.print("Enter The Amount => ");
        // int amount = input.nextInt();

        // if(amount >= 5000){
        //     amount = amount - ((amount*20)/100);
        // }
        // else if(amount <= 4999 && amount >= 3000){
        //     amount = amount - ((amount*10)/100);
        // }
        // else{
        //     amount = amount;
        // }

        // System.out.println("Final Amount is " + amount);

        //--Electricity Bill

        // System.out.print("Enter the unit => ");

        // int unit = input.nextInt();

        // if(unit >= 201){
        //     System.out.println("10/unit");
        // }
        // else if(unit >= 101 ){
        //     System.out.println("7/unit");
        // }
        // else{
        //     System.out.println("5/unit");
        // }

        //--Login Check

        String username = "Ravina";
        String password = "Ab123";

        System.out.println("Enter user and password =>");

        String user = input.nextLine();
        String paswd = input.nextLine();

        if ((username.equals(user)) && (password.equals(paswd))){
            System.out.println("Correct user and password");
        }
        else{
            System.out.println("Wrong user or password");
        }


    }
}
