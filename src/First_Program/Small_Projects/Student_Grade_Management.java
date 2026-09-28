package First_Program.Small_Projects;

import java.util.Scanner;

public class Student_Grade_Management {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        boolean value = true;

        while (value) {

            System.out.println("----- Student Result Management -----");
            System.out.println("1. Enter Student Result");
            System.out.println("2. Show Result");
            System.out.println("3. Exit");

            System.out.print("Enter your choice : ");

            //--Taking choice of user
            int choice = input.nextInt();
            int marks = 0;
            int totalMarks = 0;

           
            

            switch(choice){

                case 1 -> {

                    System.out.print("Enter Student Name : ");
                    

                    //-- Taking Student name 
                     String studenntName = input.next();

                     System.out.print("Enter Roll Number : ");
                     //-- Taking Student Roll Number

                    int rollNumber = input.nextInt();

                    for(int i = 1; i <= 5; i++ ){

                        //taking student marks with the help of for loop 
                        System.out.print("Subject " + i + " : ");
                        marks = input.nextInt();

                        

                        totalMarks = totalMarks + marks;



                    }

                    System.out.println("Total Marks : " + totalMarks);

                    

                    

                }

                case 3 -> {

                    System.out.println("Total Marks : " + totalMarks);
                    value = false;

                }

                default -> System.out.println("Invalid Value");
            }


            
        }
    }
    
}
