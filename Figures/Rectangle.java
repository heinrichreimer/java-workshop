public class Rectangle extends Figure {
    private double width; // in meters
    private double height; // in meters

    /**
     * Constructs a new rectangle with a given width and height.
     *
     * @param width The rectangle's width in meters.
     * @param height The rectangle's height in meters.
     */
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    /**
     * Constructs a new rectangle with a given width and height.
     *
     * @param width The rectangle's width in meters.
     * @param height The rectangle's height in meters.
     * @param color The color the rectangle should be filled with.
     */
    public Rectangle(double width, double height, Color fillColor){
        super(fillColor);
        this.width = width;
        this.height = height;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getWidth(){
        return width;
    }
    
    public void setHeight(double height){
        this.height = height;
    }

    public double getHeight(){
        return height;
    }

    @Override
    public double getArea(){
        return width * height;
    }

    @Override
    public double getScope(){
        return 2 * width + 2 * height;
    }
}
