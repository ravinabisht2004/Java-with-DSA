package First_Program;

import java.util.Scanner;

public class Practice_1 {

    public static void main(String[] args) {
        
        //-- Largest Question - among 3 number 

        Scanner input = new Scanner(System.in);

        System.out.print("Enter First Number => ");
        int num1 = input.nextInt();

        System.out.print("Enter Second Number => ");
        int num2 = input.nextInt();

        System.out.print("Enter Third Number => ");
        int num3 = input.nextInt();

        int max = num1;

        if(num2 > max){
            max = num2;
        }
        if(num3 > max){
            max = num3;
        }

        System.out.println(max);
    }
    
}
