import java.util.*;

public class Chalk {
     public static void main(String[] args){
        System.out.println("Enter teh value of n");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
       /* float left=0;
        for(int i=0;i<=n;i++){
            left=1/(0.5f*n);
            left++;
            
        }
       System.out.println(left*n);*/
       System.out.println(n+(int)Math.sqrt(n)+1);

     }
    
}
