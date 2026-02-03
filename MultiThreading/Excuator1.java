package MultiThreading;

public class Excuator1 {
    public static void main(String[] args)  throws InterruptedException{
        Runnable ob=()->
        {
            for(int i=0;i<10;i++){
                System.out.println("Task 1-"+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Runnable ob1=()->
        {
            for(int i=10;i<20;i++){
                System.out.println("Task 2-"+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread t1=new Thread(ob);
        Thread t2=new Thread(ob1);
        t1.start();
        t2.start();

        
    }
    
}
