public class Circle extends Figure{
    private double radius; // in meters

    /**
     * Constructs a new circle with a given radius.
     *
     * @param radius The circle's radius in meters.
     */
    public Circle(double radius){
        this.radius = radius;
    }

    /**
     * Constructs a new circle with a given radius.
     *
     * @param radius The circle's radius in meters.
     * @param color The color the circle should be filled with.
     */
    public Circle(double radius, Color fillColor){
        super(fillColor);
        this.radius = radius;
    }
    
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    public double getRadius(){
        return radius;
    }

    @Override
    public double getArea(){
        return Math.PI * radius * radius;
    }

    @Override
    public double getScope(){
        return Math.PI * 2 * radius;
    }
}
