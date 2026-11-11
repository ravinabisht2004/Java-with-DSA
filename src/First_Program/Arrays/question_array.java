package First_Program.Arrays;

public class question_array {

    public static void main(String[] args) {

        //-- Print Print Array Elements
       //-- Create an integer array of 5 elements and print all elements using a loop.

         
       int [] arr = {1, 2, 3, 4, 5};
    /*
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);  
        };
        
    */


        //Find the Sum
        //Create an array of 5 numbers and calculate the sum of all elements.

      /*int temp; 
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            temp = arr[i];
            sum = temp+sum;
            System.out.println("temp" + temp);
            System.out.println(sum);
             
        };*/

    //Find the Largest Number
    //Create an array and find the largest number without using any built-in sorting method.

     /*    int max = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if(arr[i] > max){
                max = arr[i];

            };

            
            
        };

        System.out.println(max);

        */
       
    //Count Even and Odd Numbers
    //Create an array of 10 numbers and count how many are even and how many are odd.

       /* 
        int [] num = {1, 2, 3, 7, 5, 6, 7, 8, 9, 10};
        
        
        int even = 0;
        int odd = 0;


        for (int i = 0; i < num.length; i++) {

           if (num[i] % 2 == 0) {
                even = even+1;
            }
            else{
                odd = odd+1;

            };


            
        };

        System.out.println("Count of even : " +even);
        System.out.println("Count of odd : " +odd);

    */ 

        //Reverse an Array
        //Create an array of 5 elements and print it in reverse order.

        int temp = 0;

        for (int i = (arr.length-1); i >= 0; i--) {
          
            temp = arr[i];
            System.out.println(temp);

        };
       
    };




    
};
