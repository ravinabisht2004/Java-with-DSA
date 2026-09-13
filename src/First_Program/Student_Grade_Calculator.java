package First_Program;

import java.util.Scanner;

public class Student_Grade_Calculator {

    public static void main(String[] args) {
        
    

    Scanner input = new Scanner(System.in);

    System.out.println("Enter marks of 5 subjects: ");

    
    // double subject2 = input.nextDouble();
    // double subject3 = input.nextDouble();
    // double subject4 = input.nextDouble();
    // double subject5 = input.nextDouble();

    boolean result = true;
    double totMarks = 0.00;
    char grade = 'A';
    double percentage = 0.00;
    

    for (int i = 1; i <= 5; i++) {

    System.out.print("Enter marks of subject " + i + " => ");
    double subject1 = input.nextDouble();

    totMarks = subject1+totMarks;
                
    if(subject1 < 33){
        result = false;           
    }    
    }

    percentage = totMarks/5;

    if(percentage >= 90){
        grade = 'A';
    }
    else if(percentage>=80){
        grade = 'B';
    }
    else if(percentage>=70){
        grade = 'C';
    }
    else if(percentage>=60){
        grade = 'D';
    }
    else{
        grade = 'F';
    }

    

    System.out.println("Total Marks = " + totMarks);
    System.out.println("Grade = " + grade);
//  System.out.println("Result = " +  result);
    
    System.out.println("Percentage = " + percentage);

       if (result) {
            System.out.println("Result = Pass");
        }
        else {
            System.out.println("Result = Fail");
        }

        input.close();

    


    
}

}
