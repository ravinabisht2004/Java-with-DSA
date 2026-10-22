package First_Program.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
    
        int [] rons = {12, 23, 24, 25, 26};

        //System.out.println(rons[0]);

        String[] str = new String[4];

        //System.out.println(str[0]);

        int arr[]  = new int[5];

        //array of primitives 

        arr[0] = 13;
        arr[1] = 10;
        arr[2] = 900;
        arr[3] = 345;
        arr[4] = 989;

        System.out.println(Arrays.toString(arr));

        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = input.nextInt();                     
        // };

        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + "  ");            
        // };

        
        // for(int num : arr){ //for every element in array, print the element
        //     System.out.println(num + ' '); // here num represents element of the array.
        // };

        //System.out.println(arr[5]); //index out of bound error


        //array of object 

        String[] str1 = new String[4];

        for(int i = 0; i < str1.length;  i++){
            str1[i] = input.next();
        }

        System.out.println(Arrays.toString(str1));

    };
};
