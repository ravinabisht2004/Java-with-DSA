package First_Program;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        // If condition
        if (true){
            //System.out.println("Hello World");
        }

        //While 

        int count = 1;

        while (count != 5) {
            //System.out.println(count);
            count++;
        }

        //for while 

        for (int i = 1; i != 5; i++ ){
            //System.out.println(i);
        }

        
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Temp : ");
        float tempC = in.nextFloat();
        float tempF = (tempC * 9/5) + 32;
        System.out.println(tempF);


    }

    
    
}
