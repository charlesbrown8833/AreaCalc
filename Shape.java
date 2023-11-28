/*
Charles Brown
CITC-1311-C01
Professor Frogge
Chapter 10
 */
package areacalculator;

public abstract class Shape {
    //Initialize and Assign area variable
    private String area = "Area: ";
    //Constructors
    public Shape() {
            this.area = area;
    }
    //Methods
    public abstract double getArea();
    
    @Override
    public String toString() {
        return area;
    }
}
