public class Square extends Rectangle {

    /**
     * Constructs a new rectangle with a given side length.
     *
     * @param length The rectangle's side length in meters.
     */
    public Square(double length){
        super(length, length);
    }

    /**
     * Constructs a new rectangle with a given side length.
     *
     * @param length The rectangle's side length in meters.
     * @param color The color the square should be filled with.
     */
    public Square(double length, Color fillColor){
        super(length, length);
    }

    /**
     * @hide
     *
     * Constructs a new rectangle with a width and height.
     * This is only used to override the constructor of its superclass and should not be used.
     * Calculates the average of the width and height to use as side length.
     *
     * @param width The rectangle's width in meters.
     * @param height The rectangle's height in meters.
     */
    private Square(double width, double height){
        this((width + height) / 2);
    }

    /**
     * @hide
     *
     * Constructs a new rectangle with a width and height.
     * This is only used to override the constructor of its superclass and should not be used.
     * Calculates the average of the width and height to use as side length.
     *
     * @param width The rectangle's width in meters.
     * @param height The rectangle's height in meters.
     * @param color The color the square should be filled with.
     */
    private Square(double width, double height, Color fillColor){
        this((width + height) / 2);
    }

    public void setLength(double length){
        super.setHeight(length);
        super.setWidth(length);
    }

    public double getLength(){
        // Assuming width and height are always the same
        return getWidth();
    }

    /**
     * Sets the rectangle's width and syncs the height to the same value as it is a square.
     *
     * @param width The rectangle's side length in meters.
     */
    @Override
    public void setWidth(double width){
        setLength(width);
    }

    /**
     * Sets the rectangle's height and syncs the width to the same value as it is a square.
     *
     * @param width The rectangle's side length in meters.
     */
    @Override
    public void setHeight(double height){
        setLength(height);
    }
}
