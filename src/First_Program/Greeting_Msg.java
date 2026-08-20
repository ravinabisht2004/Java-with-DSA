package First_Program;

import java.util.Scanner;

public class Greeting_Msg {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Name :- ");
        String name = input.next();

        System.out.print("Hello " + name + ".");

    }
}
