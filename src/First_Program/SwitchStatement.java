package First_Program;

import java.util.Scanner;

public class SwitchStatement {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number from 1 to 7 => ");
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

        }
    }
    
}
