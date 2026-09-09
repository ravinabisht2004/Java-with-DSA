package First_Program;

import java.util.Scanner;

public class Simple_Interest {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter principal, rate and time :- ");

        int princ = input.nextInt();
        float rate = input.nextFloat();
        int time = input.nextInt();

        int amt = (int) ((princ*rate*time)/100);

        System.out.println(amt);
    }
}
