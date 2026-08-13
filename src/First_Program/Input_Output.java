package First_Program;

import java.util.Scanner;

public class Input_Output {
    public static void main(String[] args) {
        System.out.println("Hi, this input/output");
        Scanner input = new Scanner(System.in);
//        System.out.println(input.nextInt());
        Scanner varA = new Scanner(System.in);
        System.out.println(input.nextInt() + varA.nextInt());
    }
}
