package FunctionalInterfaces;

interface IArthimatic {
    int compare(int a,int b);
}

public class IArthimaticLambda {
    public static void main (String [] args){
        
      IArthimatic add=(int a,int b)->{return (a+b) ;};
      IArthimatic sub=(int a,int b)->{return (a-b) ;};
      IArthimatic div=(int a,int b)->{return (a/b) ;};
      IArthimatic Multi=(int a,int b)->{return (a*b) ;};


        System.out.println(add.compare(55, 5));
        System.out.println(sub.compare(55, 5));
        System.out.println(div.compare(55, 10));
        System.out.println(Multi.compare(55, 5));
        
    }
    
}
    

