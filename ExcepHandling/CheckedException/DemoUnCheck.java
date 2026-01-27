package ExcepHandling.CheckedException;

import java.util.Scanner;


class PriceException extends Exception {

	public PriceException(String msg) {
		super(msg); 

} 
}
class QtyException extends Exception{ 
	public QtyException(String msg) {
		super(msg);
		}
	}

public class DemoUnCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter no.of Books: ");
            int n = Integer.parseInt(sc.nextLine());

            BookDetails[] b = new BookDetails[n];
            int i = 0;

            while (i < b.length) {
                try {
                    System.out.println("Enter code: ");
                    String code = sc.nextLine();

                    System.out.println("Enter name: ");
                    String name = sc.nextLine();

                    System.out.println("Enter price: ");
                    float price = Float.parseFloat(sc.nextLine());
                    if (price < 0)
                        throw new PriceException("Price is never negative");

                    System.out.println("Enter qty: ");
                    int qty = Integer.parseInt(sc.nextLine());
                    if (qty < 0)
                        throw new QtyException("Quantity is never negative");

                    b[i++] = new BookDetails(code, name, price, qty);

                } catch (PriceException | QtyException e) {
                    System.out.println(e.getMessage());
                    System.out.println("Re-enter details for this book\n");
                }
            }
            

            System.out.println("\n--- Book Details ---");
            for (BookDetails temp : b) {
                System.out.println(temp);
            }

        } catch (Exception e) {

            
            System.out.println(e);

        } finally {
            sc.close();
        }
    }
}