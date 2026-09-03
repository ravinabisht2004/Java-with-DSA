package First_Program;

import java.util.Scanner;

public class If_Else {

    public static void main(String[] args){

        // Salary 
        
        Scanner BasicPay = new Scanner(System.in);
        System.out.print("Please enter your salary => ");
        int Salary = BasicPay.nextInt();

        if (Salary > 25000){
            Salary = Salary + 3000;
        }
        else if(Salary >= 15000){
            Salary = Salary + 2000;
        }
        else {
            Salary = Salary + 1000;
        }

        System.out.print(Salary);
        


    }
    
}
