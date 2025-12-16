import java.util.*;
public class Product {
    String name,pid;
    float price;
    int qty;


public Product(String name,String pid,float price,int qty){
    this.name=name;
    this.pid=pid;
    this.price=price;
    this.qty=qty;
}
@Override
public String toString(){
    return "product[name="+name+",pid="+pid+",price="+price+",qty="+qty+"]";
}
public static void main(String[] args) {
    Product[]pro=new Product[3];
    Scanner in=new Scanner(System.in);
    for(int i=0;i<pro.length;i++){
        System.out.println("Enter Product details:");
         String name=in.next();
         String pid=in.next();
         float price=in.nextFloat();
         int qty=in.nextInt();
         
         
         pro[i]=new Product(name,pid,price,qty);
    }
    for(int i=0;i<pro.length;i++){
        System.out.println(pro[i].toString());
    }
    System.out.println("Enter the Name to details to search:");
      String SN=in.next();
      for(int i=0; i<pro.length; i++) {
    if(SN.equals(pro[i].name)) {
        System.out.println(pro[i]);
    }
    else 
    System.out.println("Enterd name is Invalid");
}
System.out.println("Enter the Product Name to Upgrade");
String Up=in.next();

  for(int i=0; i<pro.length; i++) {
    if(Up.equals(pro[i].pid)) {
        
        System.out.println("Enter New Product");
        String NewP=in.next();
        pro[i].pid=NewP;
        System.out.println(pro[i]);
    }
    else System.out.println("Enter Product ID is Invalid");
      
      }

    }

}


