package First_Program.Bank_Service_System;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //-- Printing Menu 

        System.out.println(" --- Menu --- ");
        System.out.println("1. Account Services");
        System.out.println("2. Card Services");
        System.out.println("3. Loan Services");

        //-- Taking menu input 

        System.out.print("Enter Service Number : ");
        int menu = input.nextInt();

        int service; 

        switch(menu){

            //-- Account Service Case 

            case 1 -> {
            
                System.out.println("Account Services");
                System.out.println("1. Check Balance");
                System.out.println("2. Update Mobile Number");
                System.out.println("3. Change Address");

                //-- taking account service input
                System.out.print("Enter Account Service Number : ");
                service = input.nextInt();

                switch(service){
                    case 1 -> {
                        System.out.println("Balance => 10,000");
                    }

                    case 2 -> {
                        System.out.println("Mobile Number Service");
                    }

                    case 3 -> {
                        System.out.println("Change Address Service");
                    }

                    default -> System.out.println("Invalid Value");

                }

                
            }

            case 2 -> {
            
                System.out.println("Card Services");
                System.out.println("1. Block Card");
                System.out.println("2. Change PIN");
                System.out.println("3. Request New Card");

                //-- taking card service input
                System.out.print("Enter Card Service Number : ");
                service = input.nextInt();

                switch(service){
                    case 1 -> {
                        System.out.println("Block Card Service");
                    }

                    case 2 -> {
                        System.out.println("Change PIN Service");
                    }

                    case 3 -> {
                        System.out.println("Request New Card Service");
                    }
                    default -> System.out.println("Invalid Number");
                }

            }

            case 3 -> {
            
                System.out.println("Loan Services");
                System.out.println("1. Home Loan");
                System.out.println("2. Personal Loan");
                System.out.println("3. Education Loan");

                //-- taking Loan service input
                System.out.print("Enter Loan Service Number : ");
                service = input.nextInt();

                switch(service){
                    case 1 -> {
                        System.out.println("Home Loan Service");
                    }

                    case 2 -> {
                        System.out.println("Personal Loan Service");
                    }

                    case 3 -> {
                        System.out.println("Education Loan Service");
                    }
                    default -> System.out.println("Invalid Number");
                }

            }

            default -> System.out.println("Invalid Value");



    

            
        }

        input.close();




        
    }
}




    

