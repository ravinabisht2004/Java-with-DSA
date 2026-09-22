package First_Program.Expense_Tracker;

import java.util.Scanner;

public class main {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

       

        

        int budget = 2000;
        int totalExpense  = 0;

       

        boolean running = false;

        while ( running = true) {

            System.out.println("===== Daily Expense Tracker =====");
            System.out.println("1. Add Expense");
            System.out.println("2. Check Total Expense");
            System.out.println("3. Check Budget Status");
            System.out.println("4. Exit");

            System.out.print("Enter choice : ");
            int choice = input.nextInt();
            

           

            switch(choice){

                

                case 1 -> {    
                        System.out.print("Enter expense amount : ");
                        int amount = input.nextInt();
                

                        if (amount <= 0){
                        System.out.println("Invalid amount");
                        }else{
                            totalExpense = totalExpense + amount;
                             System.out.println("Expense added successfully");
                           
                        }

                }

                case 2 -> {

                     System.out.println("Total Expense : " + totalExpense);

                }

                case 3 -> {
                     if (totalExpense < budget) {
                        System.out.println("You are within budget");
                        System.out.println("Remaining Budget : " + (budget + totalExpense));

                    } else if (totalExpense == budget) {
                        System.out.println("Budget fully used");

                    } else {
                        System.out.println("Budget exceeded");
                        System.out.println("Exceeded Amount : " + (totalExpense - budget));
                    }
                }

                case 4 -> {
                        running = false;
                        System.out.println("Thank you for using Daily Expense Tracker!");
                }

                default  -> System.out.println("Invalid choice");

                
            }   

            
           




            
        }
        
        
    }
    
}
