package First_Program.Function;

import java.util.Scanner;

public class Shopping_bill{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

       

        int total = 0;
        int totalPrice = 0;

        boolean value = true;

        while (value) {

            System.out.print("Enter Item : ");
            String item = input.next();

            System.out.print("Enter Price : ");
            int price = input.nextInt();

            total = addItem(item, price, total);
            System.out.println(totalPrice);


            System.out.print("Add another item : ");
            String user = input.next();

            if (user.equals("No")) {
                value = false;
                
                
            };
            
        };

            

        


    };


    static int addItem(String item, int price, int total ){

        total = price + total;

        return total;

        

    

    };

};