package p2;
import p1.Passenger;
 import java.util.*;
public class ContrainsPassenger {
    static Passenger creatPassenger(Scanner sc){
        System.out.println("Enter name : ");

		String name = sc.nextLine();

		System.out.println("Enter seat : ");

		String seat = sc.nextLine();


		System.out.println("Enter mobile : ");

		long mobile = Long.parseLong(sc.nextLine());
        if(mobile.length>10){
            System.out.println("Invalid number");

        }


    }
    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        System.out.println("Number of Adult");
        Long a=Long.parseLong(sc.nextLine());
        System.out.println("ENter number of child");
        Long c=Long.parseLong(sc.nextLine());
    
}
}
