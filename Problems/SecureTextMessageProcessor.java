import java.util.*;
public class SecureTextMessageProcessor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
        String B=sc.nextLine();
        String D=sc.nextLine();
        String T=sc.nextLine();


        A = A.replace("[", "").replace("]", "");
        B=B.replace("_","");

        StringTokenizer AG=new StringTokenizer(A);
        String F=AG.nextToken();
        String add=F.concat("STAD2025");
           StringBuilder FinalOut=new StringBuilder(add).reverse();
           System.out.println(FinalOut);
           System.out.println(B);
           if(B.contains("Fox ") && (B.contains("Shadow")) && (B.contains("Eagle"))){
               System.out.println("HIGH");
           }
           else{ System.out.println("LOW"); }
        
         
         if(T.contains("AM")){
             System.out.println(" Morning Operation");
            }
            else {
            System.out.println("Afternoon Operation");}
       
      StringJoiner Final=new StringJoiner("|");
      
         

         
      

        
        
    }
    
}
