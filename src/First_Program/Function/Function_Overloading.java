package First_Program.Function;

public class Function_Overloading {

    public static void main(String[] args) {

        func("Ira");
        func(10);
        func(10, 20);
        
        

    }

    static void func( int var){
        System.out.println(var);
    };

    static void func(String var){
        System.out.println(var);
    };

    static void func (int var, int varb){
        System.out.println(var + " " + varb);
    }
    
}
