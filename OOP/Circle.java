package OOP;

public class Circle {
    private float radius;
    public Circle(){
        this.radius=3.458f;

    }
    public Circle(float radius){
        this.radius=radius;
    }
    public String toString(){
        return ""+this.radius;

    }
    public boolean equals(Object ob){ 
        Circle temp=(Circle) ob;
        return this.radius==temp.radius;
    }
    float areOfCircle(){
        return (float) (Math.PI*this.radius*this.radius);
    }
    float areaOfCircle (Circle c){
        return (float) (Math.PI*Math.pow(c.radius,2));
    }
    
}
