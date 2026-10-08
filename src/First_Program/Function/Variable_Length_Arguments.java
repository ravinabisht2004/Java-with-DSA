package First_Program.Function;

import java.util.Arrays;

public class Variable_Length_Arguments {

    public static void main (String [] args){

        func(1, 2, 3);
        
        funtA(1, 2, "Ravina", "Abhinav"); 




    };

    static void func(int ...var){

        System.out.println(Arrays.toString(var));
    };

    static void funtA(int a, int b, String ...varibl){

        System.out.print(a + " " + b + " " + " " + Arrays.toString(varibl));
        
    }
    
};
