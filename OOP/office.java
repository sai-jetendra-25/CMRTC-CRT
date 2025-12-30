package OOP;

class Employee {
    private String name,id;
    public Employee(String name,String id){
        this.name=name;
        this.id=id;

    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public  String getId(){
        return id;
    }
    
}
public class office extends Employee{

     office(String name,String id) {
        super(name, id);
    }
    public static void main(String[] args) {
        office f1=new office("SAI", "Id");
        System.out.println(f1.getName()+ " "+f1.getId());
    
    }
    
} 