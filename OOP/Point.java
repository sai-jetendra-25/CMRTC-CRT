package OOP;
public class Point {
    private double x,y;
    public Point(){
        this.x=5.36;
        this.y=1.365;
    }
    public Point(double x,double y){
        this.x=x;
        this.y=y;
    }
    public void axixVerify(Point p){
        if(p.x==0 && p.y==0)
             System.out.println("Origin");
         else if (p.x==0) 
             System.out.println("Y-axis");
          else if(p.y==0)
             System.out.println("X-axis");
          else if(p.x>0&&p.y>0)
          System.out.println("Q-1");
          else if(p.x<0&&p.y>0)
          System.out.println("Q-2");
          else if(p.y>0&&p.y>0)
          System.out.println("Q-1");
          

         
    
    }
    static Point midPoint(Point p1,Point p2){
        return new Point((p1.x+p2.x)/2 ,(p1.y+p2.x,2));
    }
    static 


    
}