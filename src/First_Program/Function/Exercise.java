package First_Program.Function;

import java.util.Scanner;

public class Exercise {

    
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        //-- Square of number 

        System.out.print("Enter the number : ");
        int number = input.nextInt();

        int squareResult = square(number);
        
        System.out.println("Square : " + squareResult);



        
        
    }

    static int square(int number){

        return number * number;
    }
    
}
