package FunctionalInterfaces;

interface IArthimatic {
    int process(int a,int b);
}

public class IArthimaticLambda {
    public static void main (String [] args){
        
      IArthimatic add=(int a,int b)->{return (a+b) ;};
      IArthimatic sub=(int a,int b)->{return (a-b) ;};
      IArthimatic div=(int a,int b)->{return (a/b) ;};
      IArthimatic Multi=(int a,int b)->{return (a*b) ;};


        System.out.println(add.process(55, 5));
        System.out.println(sub.process(55, 5));
        System.out.println(div.process(55, 10));
        System.out.println(Multi.process(55, 5));
        
    }
    
}
    

