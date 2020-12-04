/**
 * Programmklasse zur Erzeugung einiger 
 */
public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(1.0);
        System.out.println("The circle has an area of " + circle.getArea() + " m^2."); // Should be 3.141... m^2.
        System.out.println("The circle has a scope of " + circle.getScope() + " m."); // Should be 6.283... m.
        
        circle.setRadius(2.0);
        System.out.println("The circle has an area of " + circle.getArea() + " m^2."); // Should now be 12.566... m^2.
        System.out.println("The circle has a scope of " + circle.getScope() + " m."); // Should now be 12.566... m.
        
        Rectangle rectangle = new Rectangle(2.0, 3.0);
        System.out.println("The rectangle has an area of " + rectangle.getArea() + " m^2."); // Should be 6.0 m^2.
        System.out.println("The rectangle has a scope of " + rectangle.getScope() + " m."); // Should be 10.0 m.
        
        rectangle.setWidth(4.0);
        rectangle.setHeight(1.0);
        System.out.println("The rectangle has an area of " + rectangle.getArea() + " m^2."); // Should now be 4.0 m^2.
        System.out.println("The rectangle has a scope of " + rectangle.getScope() + " m."); // Should now be 10.0 m.
        
        
        Figure figure = circle;
        System.out.println("The figure has an area of " + figure.getArea() + " m^2."); // Should be 12.566... m^2.
        System.out.println("The figure has a scope of " + figure.getScope() + " m."); // Should be 12.566... m.
        
        figure = rectangle;
        System.out.println("The figure has an area of " + figure.getArea() + " m^2."); // Should now be 4.0 m^2.
        System.out.println("The figure has a scope of " + figure.getScope() + " m."); // Should now be 10.0 m.
    }
}
