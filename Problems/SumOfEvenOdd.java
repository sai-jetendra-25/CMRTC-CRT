import java.util.*;
//write a program for finding sum of even elements and odd element
public class SumOfEvenOdd {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int SumEven=0;
        int SumOdd=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                SumEven+=i;
            }
            else 
            SumOdd+=i;
        }
        System.out.println("Sum of Even:"+SumEven);
        System.out.println("Sum of Odd:"+SumOdd);
        in.close();
    }
    
}
