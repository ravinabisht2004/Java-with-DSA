package First_Program;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {

        // Scanner input = new Scanner(System.in);
        // float num = input.nextFloat();
        //Typeconversion

        // System.out.println(num);
        
        //Typecasting
        //int num1 = (int)(10.25f);
        // System.out.println(num1);

        //Automatic type promotion in expressions

        // int a = 257;
        // byte b = (byte) (a);

        //System.out.println(b);

        // byte number1 = 40;
        // byte number2 = 50;
        // int number3 = number1 * number2;

        // System.out.println(number3);

        // Its wrong 

        // byte c = 50;
        // c = c*2;

        // int anum = 'A';

        // System.out.println(anum);

        byte b = 45;
        char c = 'c' ;
        short s = 1024;
        int i = 5000;
        float f = 10.52f;
        double d = 5.2355;
        double result = (f*b) + (i/c) - (d*s);

        System.out.println((f*b) + " " +  (i/c) + " " +  (d*s));

        System.out.println((f*b) + (i/c) - (d*s));

        


    }
}
