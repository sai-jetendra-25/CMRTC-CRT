import java.util.*;
public class GymId {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=in.nextLine();
        System.out.println("Enter the year of Joing:");
        String year=in.next();
        name=name.substring(0,3).toUpperCase();
        year=year.substring(2,4);
        String id=name+year;
        int ran=(int)(Math.random()*100);
        System.out.println("Generated ID:"+id+"X"+ran);
        in.close();
    
        
        
    }
    
}
