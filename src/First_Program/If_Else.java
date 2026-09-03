package First_Program;

import java.util.Scanner;

public class If_Else {

    public static void main(String[] args){

        // Salary 
        
        Scanner BasicPay = new Scanner(System.in);
        // System.out.print("Please enter your salary => ");
        // int Salary = BasicPay.nextInt();

        // if (Salary > 25000){
        //     Salary = Salary + 3000;
        // }
        // else if(Salary >= 15000){
        //     Salary = Salary + 2000;
        // }
        // else {
        //     Salary = Salary + 1000;
        // }

        // System.out.print(Salary);

        System.out.print("Please write a number => ");
        int number = BasicPay.nextInt();

        //Positive or Negative Number

        // if(number == 0){
        //     System.out.println("Number is 0");
        // }
        // else if (number < 0){
        //     System.out.println("Number is negative");
        // }
        // else{
        //     System.out.println("Number is positive");
        // }

        //Even or Odd

        if(number%2 == 0){
            System.out.print(number + " is Even");
        }
        else{
            System.out.println(number + " is Odd");
        }




        


    }
    
}
