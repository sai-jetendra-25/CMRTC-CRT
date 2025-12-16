import java.util.*;
public class MaxValue {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
      
        int n=in.nextInt();
        int[]arr=new int[n];
        int max=arr[0];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
            if(max>arr[i]);
            max=arr[i];

        }
        System.out.println(max);

        
    }
    
}
