package First_Program;

import java.util.Scanner;

public class Operator_Prac {

    public static void main(String[] args) {

     Scanner input = new Scanner(System.in);
     System.out.print("Enter two number :- ");

     int numA = input.nextInt();
     int numB = input.nextInt();

     System.out.print("Enter Operator :- ");
     char symbol = input.next().charAt(0);

     if (symbol == '+'){
        System.out.println(numA + numB);
     }
     else if (symbol == '-'){
        System.out.println(numA-numB);
     }
     else if (symbol == '*'){
        System.out.println(numA * numB);
     }
     else if (symbol == '/'){
        System.out.println(numA/numB);
     }
     else {
        System.out.println("Please enter right number or operator ;");
     }

        
    }
    
   


    
}
