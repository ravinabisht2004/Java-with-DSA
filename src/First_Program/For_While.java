package First_Program;

import java.util.Scanner;

public class For_While {
    public static void main(String[] args) {
        
        //--Print 1 to 10

        // for(int i = 1; i<=10; i++ ){
        //     System.out.println(i);
        // }

        //-- Print Even Numbers

        // for(int i = 1; i<=20; i++){
        //     if (i%2 == 0 ) {
        //         System.out.println(i);
                
        //     }
        // }

        //-- Print Numbers in Reverse

        // for(int i = 10; i>=1; i--){
        //     System.out.println(i);
        // }

        //-- Multiplication Table

        // System.out.print("Enter the number => ");
        // Scanner input = new Scanner(System.in);
        // int num = input.nextInt();

        // for(int i = 1; i<=10; i++){
        //     final int mult = (num*i);
        //     System.out.println(num + " * " + i + " = " + mult);
        // }

        //-- Sum of Numbers

        int sum = 0;

        for(int i = 1; i<=100; i++){
            sum = sum+i;
//            System.out.println(sum);
        }

        System.out.println(sum);




    }
    
}
