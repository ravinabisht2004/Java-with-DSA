package First_Program;

import java.util.Scanner;

public class Nested_Switch_Case {

    public static void main(String[] args) {

        //-- Scanner 

        Scanner input = new Scanner(System.in);

        //-- Taking Employee ID Input 
        System.out.print("Enter Employee ID :- ");
        int empID = input.nextInt();

        //-- Taking Employee Department 
        System.out.print("Enter Employee Department :- ");
        String empDep = input.next().toUpperCase();

        switch (empID) {
            case 1:
                System.out.println("Ravina");                
                break;

            case 2: 
                System.out.println("Abhinav");    
                break;

            case 3: 

                System.out.println("Employee ID - 3");

                switch (empDep) {
                    case "IT":
                        System.out.println("Department - IT");
                        break;

                    case "Manager":
                        System.out.println("Department - Management");    
                        break;
                
                    default:
                        System.out.println("Invalid Value");
                        break;
                }   
                
                break;
        
            default:
                System.out.println("Invalid Value");
                break;
        }


        
    }
    
}
