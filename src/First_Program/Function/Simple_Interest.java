package First_Program.Function;

import java.util.Scanner;

public class Simple_Interest {

    public static void main(String[] args) {

        //-- Scanner 

        Scanner input = new Scanner(System.in);

        //-- Taking input from user 

        System.out.print("Enter the amount : ");
        int principal = input.nextInt();

        System.out.print("Enter the rate : ");
        float rate = input.nextFloat();

        System.out.print("Enter the time : ");
        int time = input.nextInt();






        float simpleIntResult = simpleInterest(principal, rate, time);

        System.out.println("Simple Interest : " + simpleIntResult);


        
    }

    static float simpleInterest( int principal, float rate, int time){

        float calculation; 

        calculation = (principal * rate * time ) /100;

        return calculation;


    }
    
}
