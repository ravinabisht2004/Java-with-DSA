package First_Program.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayList_question {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
      
        ArrayList<String> list = new ArrayList<>();

        for (int index = 1; index <= 5; index++) {
            System.out.println("Enter the Student Name : ");
            list.add(input.next());
            
        };

        for (int index = 1; index <= 5; index++) {

            System.out.println(list.get(index));
            
        };
    };
    
};
