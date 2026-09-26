package First_Program.Small_Projects;

import java.util.Scanner;

public class Restaurant_Billing_System {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        //-- Value will be true always 

        boolean value = true;

        int mainMenu;
        

        while (value) {

            //--> Printing  Restaurant Menu
            System.out.println("----- Restaurant Menu -----");
            System.out.println("1. Main Course");
            System.out.println("2. Snacks");
            System.out.println("3. Desserts");
            System.out.println("4. Exit");

            

            

            //-- taking main menu number 
            System.out.print("Enter your choice");
            mainMenu = input.nextInt();
            String itemName;

            switch(mainMenu){
                
                

                case 1 -> {
                    itemName = "Main";

                }

                case 2 -> {
                    itemName = "Snacks";

                }

                case 3 -> {
                    itemName = "Dessert";
                    

                }

                case 4 -> {
                    value = false;
                }


                default -> System.out.println("Invalid Value");

                
            }

            //System.out.println("ravina" + itemName);

            

            
            
           
            
        }

        
        
        
    }
    
    
}
