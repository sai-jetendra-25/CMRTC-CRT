

public class ProductOops {
	
	int proId,proPrice;
	static int count;
	String proName;
	
	public ProductOops() {
        this.proId = 69;
        this.proPrice = 6999;
        this.proName = "Sai";
    }
    	
	public ProductOops(int proId,int proPrice,String proName) {
		this.proId=proId;
		this.proPrice=proPrice;
		this.proName=proName;
	}
	
	
	@Override
	public String toString() {
		return proId + " " + proPrice + " " + proName;
	}
	
	
	
	static {
		count=0;
	}
	
	{
		count++;
	}
	public static int obCount() {
        return count;
    }
	
	
	public static void main(String[] args) {
		
		ProductOops p1 = new ProductOops();
	    ProductOops p2 = new ProductOops(101, 500, "Pen");
	    ProductOops p3 = new ProductOops(102, 1000, "Book");
	    System.out.println(p1);
	    System.out.println(p2);
        System.out.println(p3);
        System.out.println("Total objects created: " + ProductOops.obCount());

	}

}
