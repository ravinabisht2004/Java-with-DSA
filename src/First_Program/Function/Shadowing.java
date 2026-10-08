package First_Program.Function;

public class Shadowing {

        static int x = 90;
    public static void main (String [] args){

        int x = 40;

        System.out.println(x);

        func();
    

    };

    static void func(){

        System.out.println(x);

    };
    
};
