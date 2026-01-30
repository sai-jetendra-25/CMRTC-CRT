package RelationshipBtwClasses;

public class MathUtil {
    static class Calculator{
        static void add(int a, int b){
            System.out.println(a+b);
        }
        void sub(int a,int b){
            System.out.println(a-b);
        }
    }
    public static void main(String[] args) {
        new MathUtil.Calculator().sub(56,34);
           MathUtil.Calculator.add(56,34);
        
    }
    
}
