package First_Program.Function;

import java.util.Scanner;

public class Prime_Number {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int number = input.nextInt();

        boolean primeNum = isPrime(number);
        System.out.println(primeNum);

        input.close();


        
    };

    static boolean isPrime(int n){
        if(n <= 1){
            return  false;
        };

        int c = 2; 

        while (c*c <= n) {
            if(n % c == 0){
                return false;
            }
            c++;
        }
        return c*c > n;

    }

    


    
}


