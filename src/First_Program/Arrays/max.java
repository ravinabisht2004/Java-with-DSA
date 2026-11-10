package First_Program.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class max {
    public static void main(String[] args) {
      
         int [] arr = {1, 22, 33, 44, 55};
         reverse(arr);

         System.err.println(Arrays.toString(arr));
         //System.out.println(max(arr));
         //System.out.println(maxRange(arr, 0, 2));
    };

    static int max(int[] arr){

        if(arr.length == 0){
            return -1;
        };

        int maxVal = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            };

        };

        return maxVal;
    };


    // work on edge case here like :- array being null
     static int maxRange(int[] arr, int start, int end){
        

        if (arr == null) {
            return -1; 
        };

        if(end > start){
            return -1;
        };

        int maxVal = arr[start];

        for(int i = start; i <= end; i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            };

        };

        return maxVal;
    };

    static  void reverse (int [] arr){

        int start = 0;
        int end = arr.length-1;

        while (start < end) {
          
            swap(arr, start, end);
            start++;
            end--;
            
        };



    };

     static void swap(int[] arr, int index1, int index2){
        int temp    = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    };
    
    
};
