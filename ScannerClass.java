import java.util.Scanner;
public class ScannerClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter you name");
        String a=sc.nextLine();
        System.out.println("Enter your age");
        int b=sc.nextInt();
        System.out.println("Your name is "+a);
        System.out.println("Your age is"+b);
        
    }
    
}
