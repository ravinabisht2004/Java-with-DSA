package First_Program.Small_Projects;

import java.util.Scanner;

public class Restaurant_Billing_System {

   
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        //-- Value will be true always 

        boolean value = true;

        int mainMenu;
        int totalBill = 0;

        int totQty   = 0;
        

        while (value) {

            //--> Printing  Restaurant Menu
            System.out.println("----- Restaurant Menu -----");
            System.out.println("1. Main Course");
            System.out.println("2. Snacks");
            System.out.println("3. Desserts");
            System.out.println("4. Exit");

            

            

            //-- taking main menu number 
            System.out.print("Enter your choice : ");
            mainMenu = input.nextInt();
            String itemName = "";
            int item = 0;
            

            int qty = 0;

            int totPrice = 0;

            switch(mainMenu){
                
                

                case 1 -> {
                    System.out.println("--- Main Course ---");
                    System.out.println("1. Pizza       200");
                    System.out.println("2. Burger      150");
                    System.out.println("3. Pasta       180");

                    System.out.print("Enter Item Number : ");
                    item = input.nextInt();

                    switch(item){

                        case 1 ->{
                            itemName = "Pizza -> 200";

                            System.out.print("Enter quantity : ");
                            qty = input.nextInt();
                            totPrice = qty * 200;
                        }

                        case 2 ->{
                            itemName = "Burger -> 150";

                            System.out.print("Enter quantity : ");
                            qty = input.nextInt();
                            totPrice = qty * 150;
                        }

                        case 3 ->{
                            itemName = "Pasta -> 180";

                            System.out.print("Enter quantity : ");
                            qty = input.nextInt();
                            totPrice = qty * 180;
                        }

                        default -> System.out.println("Invalid Value");
                    }

                       
                    }

                    


                    

                

                case 2 -> {
                    
                    System.out.println("--- Snacks Course ---");
                    System.out.println("1. French Fries  100");
                    System.out.println("2. Sandwich      120");
                    System.out.println("3. Spring Roll   130");

                    System.out.print("Enter Item Number : ");
                    item = input.nextInt();

                    switch(item){

                        case 1 ->{
                            itemName = "French Fries  -> 100";

                            System.out.print("Enter quantity : ");
                            qty = input.nextInt();
                            totPrice = qty * 100;
                        }

                        case 2 ->{
                            itemName = "Sandwich     -> 120";

                            System.out.print("Enter quantity : ");
                            qty = input.nextInt();
                            totPrice = qty * 120;
                        }

                        case 3 ->{
                            itemName = "Spring Roll -> 130";

                            System.out.print("Enter quantity : ");
                            qty = input.nextInt();
                            totPrice = qty * 130;
                        }

                        default -> System.out.println("Invalid Value");
                    }

                }

                case 3 -> {
                    System.out.println("--- Desserts  ---");
                    System.out.println("1. Ice Cream   80");
                    System.out.println("2. Brownie     120");
                    System.out.println("3. Cake        150");

                    System.out.print("Enter Item Number : ");
                    item = input.nextInt();

                    switch(item){

                        case 1 ->{
                            itemName = "Ice Cream  -> 80";

                            System.out.print("Enter quantity : ");
                            qty = input.nextInt();
                            totPrice = qty * 80;
                        }

                        case 2 ->{
                            itemName = "Brownie     -> 120";

                            System.out.print("Enter quantity : ");
                            qty = input.nextInt();
                            totPrice = qty * 120;
                        }

                        case 3 ->{
                            itemName = "Cake -> 150";

                            System.out.print("Enter quantity : ");
                            qty = input.nextInt();
                            totPrice = qty * 150;
                        }

                        default -> System.out.println("Invalid Value");

                    }
                    

                }
                

                case 4 -> {
                    value = false;
                    System.out.println("Total Bill : " + totalBill);
                }


                default -> System.out.println("Invalid Value");

                
            }

            if (!itemName.isEmpty()){

                

                
                
                 if (qty > 0) {
                               
                    System.out.println("Item Name : " + itemName);
                    totalBill = totalBill + totPrice;
                    totQty = totQty + qty;
                    System.out.println("Total Qty : " + totQty);
                    System.out.println("Total Bill : " + totalBill);

                                
                }else{
                    System.out.println("Invalid Qty");
                }

                

            }
            
            

            

            
            
           
            
        }

        
        
        
    }

   
    
    
}
