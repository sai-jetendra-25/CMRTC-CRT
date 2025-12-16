import java.util.*;
public class NaturnalNum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        Natural_NUM(n);

        
    }
    public static void Natural_NUM(int n){
        if(n==0) return ;
        System.out.print(n+" ");
        Natural_NUM(n-1);

    }
    
}
