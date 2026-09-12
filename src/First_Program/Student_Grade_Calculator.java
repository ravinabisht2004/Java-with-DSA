package First_Program;

import java.util.Scanner;

public class Student_Grade_Calculator {

    public static void main(String[] args) {
        
    

    Scanner input = new Scanner(System.in);

    System.out.println("Enter marks of 5 subjects: ");

    double subject1 = input.nextDouble();
    double subject2 = input.nextDouble();
    double subject3 = input.nextDouble();
    double subject4 = input.nextDouble();
    double subject5 = input.nextDouble();

    double result = 0.00;
    char grade = 'A';

    for (int i = 0; i < 5; i++) {

        result = subject1+subject2+subject3+subject4+subject5;

        if(result >= 90 )
            grade = 'A';
        }
        else if(result>=80){
            grade = 'B';
        }
         else if(result>=70){
            grade = 'C';
        }
         else if(result>=60){
            grade = 'D';
        }
         else if(result<60){
            grade = 'F';
        }
    

        System.out.println(i);
        
        
    }

    System.out.println(result);
    System.out.println("Grade = " + grade);
    System.out.println("Result = " );


    
}

}
