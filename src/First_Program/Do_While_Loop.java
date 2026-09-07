package First_Program;

import java.util.Scanner;

public class Do_While_Loop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number => ");
        int num = input.nextInt();

        // int num = 1;

        // do {
        //     System.out.println(num);
        //     num++;
        // } while (num <= 10);

        //---> Print Even Number

        // do {

        //     if (num%2 == 0){
        //         System.out.println(num);
        //     }
        //     num++;
        // } while (num<=20);

        //---> numbers from 10 to 1 in reverse

        // do {
        //     System.out.println(num);
        //     num--;
        // } while (num >= 1);

        //---> sum of numbers 1 to 10

        // int sum = 0;

        // do{
        //     sum = sum+num;
        //     num++;

        // }while( num <= 10);

        // System.out.println(sum);

        //---> its multiplication table

        int mult = 1;

        do {
            System.out.println(num + " * " + mult + " = " + (num * mult));
            mult++;
        } while (mult <= 10);

        
    }
    
}
