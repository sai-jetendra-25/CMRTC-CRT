package MultiThreading;

public class Main {
    public static void main(String[]args){
        Thread t1=new Thread("t1");
        t1.start();
        System.out.println(t1.getName()+'-'+t1.getId()+'-'+ t1.getPriority());

        Thread t2=new Thread("t2");
        t2.start();
        System.out.println(t2.getName()+'-'+t2.getId()+'-'+t2.getPriority());
        System.out.println(Thread.activeCount());
        
    }
    
}
