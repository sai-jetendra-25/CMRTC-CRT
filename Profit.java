import java.util.*;
class Profit{
    public static void main(String[] args){
      Scanner in=new Scanner(System.in);
      System.out.println("Enter number of copies");
      int W=in.nextInt();
      System.out.println(" copies brought(Rs)");
      int y=in.nextInt();
      System.out.println("Enter the selling price");
        int x=in.nextInt();
       /* int W=1000;
        int x=2;
        int y=1;*/
        System.out.println("copies brought :"+(W*y));
        System.out.println("copies soled:"+(W*x));
        int profit=((x-y)*W-100);
        System.out.println( "profit :"+profit);
        in.close();
    }
}