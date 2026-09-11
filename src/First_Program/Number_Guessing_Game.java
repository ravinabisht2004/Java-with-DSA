package First_Program;

import java.util.Scanner;

public class Number_Guessing_Game {

    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);

    int guess = 7;
    int attempt = 0;

    while (attempt < 5) {

        System.out.print("Enter your guess => ");
        int num = input.nextInt();

        attempt++;


        if( guess == num){
            System.out.println("Correct Answer");
            break;
        }
        else if (guess < num){
            System.out.println("Too High");
        }
        else {
            System.out.println("Too Low");
        }

        if (attempt == 5){
            System.out.println("Game over");
        }
       
    }

   
    }
    
}
