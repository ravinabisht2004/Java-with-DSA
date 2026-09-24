package First_Program;

import java.util.Scanner;

public class Switch {

         public static void main(String[] args) {
            
            Scanner input = new Scanner(System.in);
            /*
            System.out.print("Please Enter Fruit Name :- ");
            String fruit = input.next();

            

            switch (fruit) {
                case "Mango":
                    System.out.println("King of fruits");
                    break;
                
                case "Apple":
                    System.out.println("A sweet red fruit");
                    break;

                case "Orange":
                    System.out.println("Round fruit");
                    break;

                case "Grapes":
                    System.out.println("Small fruit");
                default:
                    System.out.println("Please enter valid fruit");
                    
            }

            switch(fruit){
                case "Mango" -> System.out.println("King of fruits");
                case "Apple" -> System.out.println("Red fruit");
                case "Orange" -> System.out.println("Round fruit");
                default -> System.out.println("Please enter a valid input");
            }

             */

            //---> Weekdays or Weekend 
            System.out.print("Enter the day number : ");
            int day = input.nextInt();

            switch (day) {
                case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
                case 6, 7 -> System.out.println("Weekend");
                default -> System.out.println("Invalid Day");
            }


           
         }
}