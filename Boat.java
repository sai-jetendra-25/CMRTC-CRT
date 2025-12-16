import java.util.*;
public class Boat {
    public static void main(String[] args) {
        
           Scanner sc=new Scanner(System.in);
        System.out.println("Enter the weight of the boat can handle");
        int boat =sc.nextInt();
        System.out.println("Enter the number of adult");
        int adult =sc.nextInt();
        System.out.println("Enter the  number of child");
        int child=sc.nextInt();
        
        int total=(75*adult)+(30*child);
        if(total<=boat) System.out.println("Boat is stable");
        else System.out.println("Boat will drown");
        

        sc.close();
        
    }
    
}
