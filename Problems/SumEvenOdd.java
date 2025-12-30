import java.util.Scanner;

 public class SumEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the limit: ");
        int n = sc.nextInt();

        int positive = 0, negitive = 0;

        for (int i = 1; i <= n; i++) {
          if(i>0)
                positive += i;
            else
                negitive += i;
        }

        System.out.println("Sum of positive Numbers: " + positive);
        System.out.println("Sum of negitive Numbers: "+"-"+ negitive);

        sc.close();
    }
}
