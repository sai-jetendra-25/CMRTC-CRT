package ExcepHandling.CheckedException;


public class BookDetails {
	String code,name;
	float price;
	int qty;
	public BookDetails(String code2,String name2,float price2,int qty2) {
		this.code=code2;
		this.name=name2;
		this.price=price2;
		this.qty=qty2;
	}
	@Override
public String toString() {
	return "BookDetails [code="+code+",name="+name+",price="+price+",qty="+qty+"]"; 
}
}
