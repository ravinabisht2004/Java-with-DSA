package First_Program.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayList {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Integer> List = new ArrayList<>();

        List.add(100);
        List.add(200);
        List.add(300);
        List.add(400);
        List.add(500);

        System.out.println(List);

        //-- check the arraylist contains value or not 
        System.out.println(List.contains(400));


        //-- Set new value in index
        List.set(1, 99);
        System.out.println(List);

        //-- Remove the index
        System.out.println(List.remove(3));




        ArrayList<Integer> arrList = new ArrayList<>();

        for(int i = 0; i < 5; i++){
            arrList.add(input.nextInt());
        };

        //-- get item at any index 

        for(int i = 0; i < 5; i++){
            System.out.println(arrList.get(i));
        };

        System.out.println(arrList);

        input.close();






        
    };
    
};
