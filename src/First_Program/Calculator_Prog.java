package First_Program;

import java.util.Scanner;

public class Calculator_Prog {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        // Take input from user till user does not press X or x

        int ans = 0;

        while (true) {
            System.out.print("Enter  the operator => ");
            char oper = input.next().trim().charAt(0);

            if (oper == '+' || oper == '-' || oper == '*' || oper == '/' || oper == '%'){

                //take two number input 

                System.out.print("Enter two number => ");

                int num1 = input.nextInt();
                int num2 = input.nextInt();

                if(oper == '+'){
                    ans = num1 + num2;
                }

                 if(oper == '-'){
                    ans = num1 - num2;
                }

                 if(oper == '*'){
                    ans = num1 * num2;
                }

                 if(oper == '/'){
                    if (num2 != 0){
                        ans = num1/num2;
                    }
                    
                }

                 if(oper == '%'){
                    ans = num1 % num2;
                }

                
            }else if (oper == 'X' || oper == 'x'){
                break;
            }else{
                System.out.println("Invalid");
            }

            System.out.println(ans);
            
        }

    }
    
}
