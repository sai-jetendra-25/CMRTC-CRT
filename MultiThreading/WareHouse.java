package MultiThreading;
class ProductWareHouse{
    static int NoOfProducts =0,NoOfProducts2=0;
    void countProducts(){
        synchronized (this) {
            NoOfProducts+=50;
            
        }
        NoOfProducts2+=50;
    }
}
public class WareHouse {
    static ProductWareHouse P=new ProductWareHouse();
    public static void main(String[] args){
        Runnable ob=()->{
            for(int i=0;i<10000;i+=50){
                P.countProducts();
            }

        };
        
        Runnable ob2=()->{
            for(int i=0;i<8000;i+=50){
                P.countProducts();
            }

        };
        
        Runnable ob3=()->{
            for(int i=0;i<12000;i+=50){
                P.countProducts();
            }

        };
        
        Thread t1=new Thread(ob);
        Thread t2=new Thread(ob2);
        Thread t3=new Thread(ob3);
        t1.start();
        t2.start();
        t3.start();
        try {
            t1.join();
            t2.join();
            t3.join();
            
        } catch ( InterruptedException e) {
            e.printStackTrace();

        }
        System.out.println(P.NoOfProducts);
        System.out.println(P.NoOfProducts2);

    }
    
}
