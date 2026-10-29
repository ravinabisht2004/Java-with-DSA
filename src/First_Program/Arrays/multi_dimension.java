package First_Program.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class multi_dimension {
  
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
      
        int [] [] arr2D = {
          
                    {1, 2, 3},
                    {4, 5},
                    {6, 7, 8, 9}
        };  

        //System.out.println(Arrays.deepToString(arr2D));

        //input 

        //System.out.println( arr2D.length);

        int [] [] arr = new int [3] [3];

        for(int i = 0; i < arr.length; i++ ){
            for(int j = 0; j < arr[i].length ; j++){

                //System.out.println( "row " + i);
                //System.out.println("col " + j);
                arr[i][j] = input.nextInt();
                System.out.print(arr[i][j] + " ");          
            };
            System.out.println();
            
        };

        // System.out.println(Arrays.deepToString(arr));

        //  for(int i = 0; i < arr.length; i++ ){        

        //         //System.out.println( "row " + i);
        //         //System.out.println("col " + j);
                
        //         //It's taking user input from upper loop its working only to print array.
        //        System.out.println(Arrays.toString(arr[i]));            
        // };

        for(int [] a : arr){
            System.out.println(Arrays.toString(a));
        };

        

    };
};
