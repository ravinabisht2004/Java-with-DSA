package First_Program;
import java.util.Scanner;

public class Odd_Even {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number :- ");
        int number = input.nextInt();

        if (number % 2 == 0 ){
            System.out.print("Number " + number + " is even");
        }else {
             System.out.print("Number " + number + " is odd");
        };


    };
};


