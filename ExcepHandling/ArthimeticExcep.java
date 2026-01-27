package ExcepHandling;
public class ArthimeticExcep {

    public static void main(String[] args) {
        int a = 2;
        int b = 0;

        try {
            System.out.println(a / b);
        }
        catch (ArithmeticException ob) {
            System.out.println("b cannot be zero");
        }
    }
}
    

