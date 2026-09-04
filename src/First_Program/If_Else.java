package First_Program;

import java.util.Scanner;

public class If_Else {

    public static void main(String[] args){

        // Salary 
        
        Scanner Input = new Scanner(System.in);
        // System.out.print("Please enter your salary => ");
        // int Salary = Input.nextInt();

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

        // System.out.print("Please write a number => ");
        // int number = Input.nextInt();

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

        // if(number%2 == 0){
        //     System.out.print(number + " is Even");
        // }
        // else{
        //     System.out.println(number + " is Odd");
        // }



        //-- Eligible to Vote
        
        // System.err.print("Please Enter Your Age :- ");
        // int age = Input.nextInt();

        // if (age >= 18){
        //     System.out.println("Eligible to vote");
        // }
        // else{
        //     System.out.println("Not eligible");
        // }

        //-- Greater Number - Two numbers comparision

        // System.out.print("Please write a Second number => ");
        // int secondnumber = Input.nextInt();

        // if (number > secondnumber ){
        //     System.out.println("First number is greater than second number");
        // }
        // else if (number == secondnumber){
        //     System.out.println("Both numbers are equal");
        // }
        // else{
        //     System.out.println("Second number is greater than first number");
        // }

        //-- Pass or Fail - If marks are 40 or above, print "Pass", otherwise "Fail"

        System.out.print("Please enter your marks - ");
        float marks = Input.nextFloat();

        if (marks >= 40){
            System.out.println("Pass :- " + marks);
        }
        else{
            System.out.println("Fail :- " + marks);
        }

        





        


    }
    
}
