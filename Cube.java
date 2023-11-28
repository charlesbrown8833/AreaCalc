/*
Charles Brown
CITC-1311-C01
Professor Frogge
Chapter 10
 */
package areacalculator;

public class Cube extends Square {
    public Square side;
    public double cubeSide;
    public double surfaceArea;
    //Constructors
    public Cube(double cubeSide) {
        this.cubeSide = cubeSide;
    }
    //Methods
    public void sideValue(Square side) {
        this.side = side;
    }
    public double getCubeSide() {
        return cubeSide;
    }
    public void setCubeSide(double width) {
        this.width = cubeSide;
    }
    public double getSurfaceArea() {
        surfaceArea = cubeSide * cubeSide * 6;
        return surfaceArea;
    }
    @Override
    public String toString() {
        return "Surface Area: " + getSurfaceArea();
    }
}
