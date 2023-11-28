/*
Charles Brown
CITC-1311-C01
Professor Frogge
Chapter 10
 */
package areacalculator;

public class Circle extends Shape{
    public double area;
    public double radius;
    private final double pi = 3.141592653589793;
    //Constructors
    public Circle(double radius) {
        this.radius = radius;
    }
    //Methods
    public double getRadius() {
        return radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;       
    }
    @Override
    public double getArea() {  
        area = (radius * radius) * pi;
        return area;
    }
    @Override
    public String toString() {
        return super.toString() + getArea();
    }
    
}
