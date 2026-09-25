package First_Program.College_Course_Selection;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        //-- Printing Department List 

        System.out.println("Choose department : ");
        System.out.println("1. Computer Science");
        System.out.println("2. Commerce");
        System.out.println("3. Management");

        //-- taking department number 

        System.out.print("Enter Department Number : ");
        int department = input.nextInt();
        int course;

        switch(department){

            case 1 -> {
                System.out.println("Computer Science Course List : ");
                System.out.println("1. Java");
                System.out.println("2. Python");
                System.out.println("3. Data Structures");

                System.out.print("Enter Course Number : ");
                course = input.nextInt();
                switch(course){
                    case 1 -> System.out.println("Department -> Computer Science & Course -> Java");
                    case 2 -> System.out.println("Department -> Computer Science & Course -> Python");
                    case 3 -> System.out.println("Department -> Computer Science & Course -> Data Structures");
                    default -> System.out.println("Invalid Value");
                }
            }

            case 2 -> {

                 System.out.println("Commerce Course List : ");
                 System.out.println("1. Accounting");
                 System.out.println("2. Taxation");
                 System.out.println("3. Economics");

                 System.out.print("Enter Course Number : ");
                 course = input.nextInt();
                 switch(course){
                    case 1 -> System.out.println("Department -> Commerce  & Course -> Accounting");
                    case 2 -> System.out.println("Department -> Commerce  & Course -> Taxation");
                    case 3 -> System.out.println("Department -> Commerce  & Course -> Economics");
                    default -> System.out.println("Invalid Value");
                 }

            }

            case 3 -> {

                 System.out.println("Management Course List : ");
                 System.out.println("1. Marketing");
                 System.out.println("2. Finance");
                 System.out.println("3. HR");

                 System.out.print("Enter Course Number : ");
                 course = input.nextInt();
                 switch(course){
                    case 1 -> System.out.println("Department -> Management  & Course -> Marketing");
                    case 2 -> System.out.println("Department -> Management  & Course -> Finance");
                    case 3 -> System.out.println("Department -> Management  & Course -> HR");
                    default -> System.out.println("Invalid Value");
                 }

            }

            default -> System.out.println("Invalid Value");
        }

        



    }
    
}
