package First_Program.Food_Ordering_System;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        //-- Taking Input 
        Scanner input = new Scanner(System.in);

        System.out.println("--- Main menu ---");
        System.out.println("1. Vegetarian");
        System.out.println("2. Non-Vegetarian");
        System.out.println("3. Drinks");

        System.out.print("Enter your menu number - ");
        int menuNo = input.nextInt();

        switch(menuNo){
            case 1-> {
                    System.out.println("1. Paneer");
                    System.out.println("2. Dal");
                    System.out.println("3. Veg Biryani");
                    
                    System.out.print("Enter your menu number - ");
                    int vegMenuNo = input.nextInt();

                    switch(vegMenuNo){

                        case 1 -> System.out.println("Paneer        -> 100");
                        case 2 -> System.out.println("Dal           -> 70");
                        case 3 -> System.out.println("Veg Biryani   -> 150");
                        default -> System.out.println("Invalid Value");
                    }
            }

             case 2-> {
                    System.out.println("1. Chicken");
                    System.out.println("2. Mutton");
                    System.out.println("3. Egg Curry");
                    
                    System.out.print("Enter your menu number - ");
                    int nonvegMenuNo = input.nextInt();

                    switch(nonvegMenuNo){

                        case 1 -> System.out.println("Chicken        -> 200");
                        case 2 -> System.out.println("Mutton         -> 250");
                        case 3 -> System.out.println("Egg Curry      -> 100");
                        default -> System.out.println("Invalid Value");
                    }
            }

             case 3-> {
                    System.out.println("1. Coke");
                    System.out.println("2. Juice");
                    System.out.println("3. Coffee");
                    
                    System.out.print("Enter your menu number - ");
                    int drinkMenuNo = input.nextInt();

                    switch(drinkMenuNo){

                        case 1 -> System.out.println("Coke     -> 70");
                        case 2 -> System.out.println("Juice    -> 80");
                        case 3 -> System.out.println("Coffee   -> 150");
                        default -> System.out.println("Invalid Value");
                    }
            }

            default -> System.out.println("Invalid Menu Number");
            
        }


    }
    
}
