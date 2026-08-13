package First_Program;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num = input.nextFloat();
        //Typeconversion
        System.out.println(num);
        
        //Typecasting
        int num1 = (int)(10.25f);

        System.out.println(num1);
    }
}
