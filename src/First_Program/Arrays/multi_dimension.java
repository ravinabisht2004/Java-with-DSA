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

        System.out.println( arr2D.length);

        for(int i = 0; i < arr2D.length; i++ ){
            for(int j = 0; j < arr2D[i].length ; j++){

                System.out.println( "row " + i);
                System.out.println("col " + j);
                arr2D[i][j] = input.nextInt();
                

            };

            
        };

        System.out.println(Arrays.deepToString(arr2D));

    };
};
