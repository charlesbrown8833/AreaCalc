/*
Charles Brown
CITC-1311-C01
Professor Frogge
Chapter 10
*/
package areacalculator;

public class AreaCalculator {


    public static void main(String[] args) {
        //Set Initial Choice Value
        String choice = "y";
        System.out.println("Welcome to the Area Calculator");
        System.out.println();
        
        while(choice.equalsIgnoreCase("y")) {
            //Get User Choice
            String userChoice = Console.getString("Calculate the area of a circle, square, rectangle, or cube? (c/s/r/d): ");
            System.out.println();
            if (userChoice.equalsIgnoreCase("c")) {
                System.out.println("CIRCLE:");
                double radius = Console.getDouble("Enter Radius: ");
                Shape shape = new Circle(radius);
                System.out.println(shape.toString());
            }
            if (userChoice.equalsIgnoreCase("s")) {
                System.out.println("SQUARE:");
                double width = Console.getDouble("Enter Width: ");
                Shape shape = new Square(width);
                System.out.println(shape.toString());    
            }
            if (userChoice.equalsIgnoreCase("r")) {
                System.out.println("RECTANGLE:");
                double width = Console.getDouble("Enter Width: ");
                double height = Console.getDouble("Enter Height: ");
                Square square = new Rectangle(width, height);
                System.out.println(square.toString());    
            }
            if (userChoice.equalsIgnoreCase("d")) {
                System.out.println("CUBE:");
                double side = Console.getDouble("Enter length of cube side: ");
                Cube cube = new Cube(side);
                System.out.println(cube.toString());
            }            
            System.out.println();
            choice = Console.getString("Continue? (y/n): ");
        }
    }
}
