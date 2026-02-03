package MultiThreading;
class Employee extends Thread{
    public Employee(String id){
        super(id);
    }
    @Override
    public void run(){
        System.out.println("Hello"+"->"+this.getName());
    }
}
class Manager extends Thread{
    public Manager(String id){
        super(id);
    }
    @Override
    public void run(){
        System.out.println("Hai->"+this.getName());
    }
}


public class Excuator {
    public static void main(String[] args) {
        Employee o=new Employee("S2");
        Manager ob=new Manager("S2");
        o.start();
        ob.start();

    }

    
}
