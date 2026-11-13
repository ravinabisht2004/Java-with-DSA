package First_Program.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

import javax.lang.model.util.Elements;

public class arrayList_question {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Add and Print Elements
        //Create an ArrayList of String type. Add 5 student names and print all names.
      
        ArrayList<String> list = new ArrayList<>();

        // for (int index = 1; index <= 5; index++) {
        //     System.out.println("Enter the Student Name : ");
        //     list.add(input.next());
            
        // };

        // for (int index = 0; index < 5; index++) {

        //     System.out.println(list.get(index));
            
        // };


        //Remove an Element
        //Create an ArrayList of 5 fruits. Remove one fruit entered by the user.

       /* list.add("Mango");
        list.add("Grapes");
        list.add("Apple");
        list.add("Pine-apple");
        list.add("Guava");

        
        System.out.print("Please enter the value : ");

        list.remove(input.next());

        System.out.println(list); */

        //--Search an Element
        //--Create an ArrayList of 5 numbers. Ask the user for a number and check whether it exists in the list.

        ArrayList<Integer> number = new ArrayList<>();

        number.add(1);
        number.add(2);
        number.add(3);
        number.add(14);
        number.add(5);

        //System.out.print("Please enter the value : ");
        //System.out.println(number.contains(input.nextInt()));

        //Find the Largest Number
        //Create an ArrayList of integers and find the largest number.

        int max = number.get(0);

        for (int index = 0; index < 5; index++) {

            if (number.get(index) > max) {

                max = number.get(index);
                
            };

           
            
        };

        System.out.println("Max value : " +max);

        

        //Update an Element
        //Create an ArrayList of 5 city names. Replace the second city with a new city name.

        ArrayList<String> city = new ArrayList<>();

        city.add("New Delhi");
        city.add("Old Delhi");
        city.add("Ramnagar");
        city.add("Gopalganj");
        city.add("Jaladhpur");

        city.set(1, "Gaziyabadh");

        System.out.println(city);

    };
    
};
