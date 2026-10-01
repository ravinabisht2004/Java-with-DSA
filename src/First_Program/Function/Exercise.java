package First_Program.Function;

import java.util.Scanner;

public class Exercise {

    
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        //-- Square of number 

        /*System.out.print("Enter the number : ");
        int number = input.nextInt();

        int squareResult = square(number);
        
        System.out.println("Square : " + squareResult);*/


        //-- greater of two numbers.

        System.out.print("Enter First Number : ");
        int number1 = input.nextInt();
    
        System.out.print("Enter Second Number : ");
        int number2 = input.nextInt();

        int greaterResult = greaterTwoNo(number1, number2);

        System.out.println("Greater Number : " + greaterResult);





        
        
    }

    static int square(int number){

        return number * number;
    }

    static int greaterTwoNo(int num1, int num2){

        int result; 
        if (num1 == num2){
            result = num1;
        }
        else if(num1 > num2){
            result = num1;
        }else{
            result = num2;
        }

        return result;
    }
    
}
