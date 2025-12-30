import java.util.*;
public class ifelse
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int row =sc.nextInt();
        System.out.println("Enter number of coloum");
        int col =sc.nextInt();
        System.out.println("Enter the tree number");
        int tree =sc.nextInt();
        if(tree%col==0|| tree%col==1||tree>=1 && tree<=col)
               System.out.println("YES");
        else System.out.println("NO");
        sc.close();



        
    }
    
}
