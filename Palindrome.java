import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
         
         String rev="";
         for(int i=0;i<=s.length()-1; i++){
            rev+=s.charAt(i);
         
         }
         if(s.equals(rev)){
            System.out.println("YES");


         }
         else System.out.println("No");
         in.close();

        

            

        
        
    }
}
    

