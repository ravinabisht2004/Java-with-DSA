
package First_Program.Function;

import java.util.Scanner;

public class basic {
    public static void main(String[] args) {

        // int ans = sum();

        // System.out.println("Answer : " + ans);

        // String greet = greeting();

        // System.out.println(greet);
        // greeting2();

        Scanner input1 = new Scanner(System.in);

        System.out.print("Enter number1 : ");
        int numa = input1.nextInt();
        System.out.print("Enter number2 : ");
        int numb = input1.nextInt();

        int sumFunction = sumoftwo(numa, numb);

        System.out.println(sumFunction);

        input1.close();
        
        
    }

    static int sum(){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number : ");
        int num = input.nextInt();

        System.out.print("Enter number2 : ");
        int num2 = input.nextInt();

        int sum = num + num2;

        return sum;

        
    }
    
    static String greeting(){
        String msg = "Hello, miss Ravina";

        return msg;
    }

    static void greeting2(){
        String msg = "Hello, Mr' Abhinav";

        System.out.println(msg);
    }


    //Passing argument in it 

    static int sumoftwo(int a, int b){

        int sum = a + b;

        return sum;
        
        
    }

    

}
