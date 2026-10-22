package First_Program.Arrays;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
    
        int [] rons = {12, 23, 24, 25, 26};

        //System.out.println(rons[0]);

        String[] str = new String[4];

        //System.out.println(str[0]);

        int arr[]  = new int[5];

        arr[0] = 13;
        arr[1] = 10;
        arr[2] = 900;
        arr[3] = 345;
        arr[4] = 989;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();                     
        };

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");            
        };

        
        

    };
};
