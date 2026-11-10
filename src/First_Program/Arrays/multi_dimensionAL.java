package First_Program.Arrays;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class multi_dimensionAL {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<ArrayList<Integer>>list = new ArrayList<>();

        for (int i = 0; i < 3; i++) {

            list.add(new ArrayList<>());
            
        };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(input.nextInt());

                //get the list at index number 
                
            };
            
        };

        System.out.println(list);
        
    };
    
};
