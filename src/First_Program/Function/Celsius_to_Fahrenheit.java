package First_Program.Function;

import java.util.Scanner;

public class Celsius_to_Fahrenheit {

    public static void main(String[] args) {

        //-- Scanner
        Scanner input = new Scanner(System.in);

        //-- Taking input from user
        System.out.print("Enter the celsius : ");
        float celsius = input.nextFloat();

        float result = celsiustoFahre(celsius);

        System.out.println("Fahrenheit : " + result);

        input.close();
        
    }

    static float celsiustoFahre(float celsius){

        //-- Calculating Fahrenheit 

        float result = (celsius * 9f/5f) + 32;

        return result;

    }
    
}
