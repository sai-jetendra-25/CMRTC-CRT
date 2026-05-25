interface Icompare{
    int compare(int a,int b);
}
class Greater implements Icompare{
    @Override
    public int compare(int a ,int b){
        if(a>b) return a;
        else return b;
    }
}

class Smaller implements Icompare{
    @Override
    public int compare(int a ,int b){
        if(a<b) return a;
        else return b;
    }
}

public class Difference {
    public static void main(String[] args) {
      System.out.println(new Greater().compare(44, 66));
      System.out.println(new Smaller().compare(44, 66));
         
    }
    
}
