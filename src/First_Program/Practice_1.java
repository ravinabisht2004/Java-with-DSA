package First_Program;

import java.util.Scanner;

public class Practice_1 {

    public static void main(String[] args) {
        
        //-- Largest Question - among 3 number 

        Scanner input = new Scanner(System.in);


        // System.out.print("Enter First Number => ");
        // int num1 = input.nextInt();

        // System.out.print("Enter Second Number => ");
        // int num2 = input.nextInt();

        // System.out.print("Enter Third Number => ");
        // int num3 = input.nextInt();

        // int max = num1;

        // if(num2 > max){
        //     max = num2;
        // }
        // if(num3 > max){
        //     max = num3;
        // }


        // Another Method of Solving This

        // int max = Math.max(num3, Math.max(num1, num2));
        // System.out.println(max);


        // -- Take Input of Character & find out uppercase or lowercase

        // char letter = input.next().trim().charAt(0);

        // if (letter >= 'a' && letter <= 'z'){
        //     System.out.println("Lowercase");
        // }else{
        //     System.out.println("Uppercase");
        // }

        //-- Find the nth fibonacci number

        // int num = input.nextInt();

        // int prev = 0;
        // int curr = 1; 

        // int count = 2;

        // while (count <= num ) {
        //     int temp = curr;
        //     curr = curr + prev;
        //     prev = temp;
        //     count++;
        //     //System.out.println(curr);    
        // }

        // System.out.println(curr);


        //---> Counting Occurences

        System.out.print("Enter the number => ");    
        int num = input.nextInt();

        System.out.print("Enter the occure number => ");
        int find = input.nextInt();

        int count = 0;

        while (num > 0) {
            int rem = num % 10;

            if (rem == find){
                count++;
            }

            num = num/10;

        }

        System.out.println(count);






        
        
        

    }
    
}
