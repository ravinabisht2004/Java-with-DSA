package First_Program;

import java.util.Scanner;

public class While_Loop {

    public static void main(String[] args) {
        // int num = 1;
        // while (num <= 10) {

        //     System.out.println(num);
        //     num++;
            
        // }

        //--> Odd number

        // int num = 1;

        // while (num <= 20) {
        //     if (num%2 != 0) {
        //         System.out.println(num);
        //     }
        //     num++;
            
        // }

        //--> reverse number from 20 to 1

        // int num = 20;

        // while (num >= 1) {
        //     System.out.println(num);
        //     num--;
        // }

        // //--> sum of even numbers from 1 to 50

        // int num = 1;
        // int sum = 0;

        // while (num <= 50) {

        //     if(num%2 == 0){
        //         sum = sum + num;
                
        //     }
        //     num++;
            
        // }

        // System.out.println(sum);

        //--> Take a number from the user and count how many digits

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number => ");

        int num = input.nextInt();
        int count = 0;

        while (num > 0) {
            num = num/10;
            count++;
        }
        System.out.println(count);
    }
    
}
