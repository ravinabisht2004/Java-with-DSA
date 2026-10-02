package First_Program.Function;

import java.util.Scanner;

public class Checking_Number_Type {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        //-- taking input from user 

        System.out.print("Enter the number : ");
        int number = input.nextInt();

        checkingNumberType(number);

        

        input.close();


    }

    static void checkingNumberType(int number){

        if (number == 0 ){

            System.out.println("Number is 0");

        }else if (number > 0){

            System.out.println("Number is Positive");

        }else{

            System.out.println("Number is Negative");
    }

    }
    
}
