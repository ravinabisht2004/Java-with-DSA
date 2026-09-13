package First_Program;

import java.util.Scanner;

public class Number_Analyzer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter 10 Number : ");

        int largeNum = 0;
        int sum = 0;
        


        for (int i = 1; i <= 10; i++) {

            int prev = 0;
            int num = input.nextInt();

            sum = num + sum;

            prev = num;
            System.out.println(prev);

            // if(prev < num){
            //     System.out.println(num);
            // }

            
            
        }

        System.out.println("Total Sum : " + sum);
    }
    
}
