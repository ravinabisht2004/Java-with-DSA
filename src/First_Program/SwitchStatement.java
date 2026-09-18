package First_Program;

import java.util.Scanner;

public class SwitchStatement {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //--> Day Finder

       /*System.out.print("Enter number from 1 to 7 => ");
        int day = input.nextInt();

        switch(day){

            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Enter valid number from 1 to 7");

        }*/

        //--> Simple Calculator

        System.out.print("Enter the operator => ");
        char operator = input.next().trim().charAt(0);


        System.out.print("Enter two number => ");
        
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();

        switch(operator){

    case '+' -> System.out.println(num1 + num2);
    case '-' -> System.out.println(num1 - num2);
    case '*' -> System.out.println(num1 * num2);
    case '/' -> {
        if (num2 == 0) {
            System.out.println("Cannot divide by zero");
        } else {
            System.out.println(num1 / num2);
        }
    }
    default -> System.out.println("Please enter valid operator");
}
    }
    
}
