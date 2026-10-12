package First_Program.Function;

import java.util.Scanner;

public class Amstrong_Number {

    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int number = input.nextInt();

        System.out.println(amstrongNum(number));

    };

    static boolean amstrongNum(int num){

        int original = num;
        int rem;
        int cube;
        int sum = 0; 

        while (num > 0) {

            rem = num % 10;
            cube = rem * rem * rem;
            sum+= cube;
            num = num/10;

            
        };

      return sum == original;
        

    };
    
};
