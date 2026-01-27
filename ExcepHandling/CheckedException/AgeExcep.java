package ExcepHandling.CheckedException;
class InvalidAgeException extends Exception{
    public InvalidAgeException(String msg){
        super(msg);
    }
}

public class AgeExcep {
    public static void main(String[] args) {
        try {
            validate(18);
            
        } catch (InvalidAgeException ob)  {
            System.out.println(ob);
        }
    }
    private static void validate(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("Age not sufficinet");
        }
        else 
        System.out.println("Age valid");
    }
    
}
