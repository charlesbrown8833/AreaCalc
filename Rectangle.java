/*
Charles Brown
CITC-1311-C01
Professor Frogge
Chapter 10
 */
package areacalculator;

public class Rectangle extends Square {
    public double height;
    //Constructors
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    //Methods
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    @Override
    public double getArea() {
        area = width * height;
        return area;
    } 
}
