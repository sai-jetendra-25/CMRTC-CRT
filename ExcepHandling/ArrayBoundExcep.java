package ExcepHandling;

public class ArrayBoundExcep {

    public static void main(String[] args) {
        int [] a={1,2,3,4};
        
        try {
            System.out.println(a[5]);
            
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array length is out of Bound");
        }
    }
}
    


