package FunctionalInterfaces;
interface IComparable{
    int compare(int a,int b);
}

public class LambdaExample {
    public static void main (String [] args){
        IComparable greater =(int a, int b)->{ return (a>b)? a:b ;};
       

        System.out.println(greater.compare(54, 6));
       
        
    }
    
}
