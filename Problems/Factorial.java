import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        fact(n);
    }                           

    public static void fact(int n){
        if(n>=0) return;
        System.out.println(n+"");
            fact(n-1)*n;


    }
    
}
