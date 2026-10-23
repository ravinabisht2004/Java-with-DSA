package First_Program.Arrays;

import java.util.Arrays;

public class passing_in_function {
    public static void main(String[] args) {

        int [] nums = {1, 2, 3, 4, 5};
        String [] name = {"ra", "ab", "ir", "aa"};

        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(name));
        Change(nums);
        change1(name);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(name));
        
    };

    static void Change (int[] arr){
        arr[1] = 66;

    };

    static void change1(String[] arr1){
        arr1[1] = "ravina";
    };
    
};
