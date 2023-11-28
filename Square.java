/*
Charles Brown
CITC-1311-C01
Professor Frogge
Chapter 10
 */
package areacalculator;

public class Square extends Shape {
    public double width;
    public double area;
    //Constructors
    public Square() {
    }
    public Square(double width) {
        this.width = width;
    }
    //Methods
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    @Override
    public double getArea() {
        area = width * width;
        return area;
    }
    @Override
    public String toString() {
        return super.toString() + getArea();
    }
}
