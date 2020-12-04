public abstract class Figure {
    private Color fillColor;

    /**
     * Constructs a new figure with a black fill color.
     * Subclasses must override this constructor.
     */
    protected Figure() {
        this(Color.BLACK);
    }

    /**
     * Constructs a new figure with a given fill color.
     * Subclasses must override this constructor.
     *
     * @param color The color the figure should be filled with.
     */
    protected Figure(Color fillColor) {
        this.fillColor = fillColor;
    }

    public void setFillColor(Color fillColor) {
        this.fillColor = fillColor;
    }

    public Color getFillColor() {
        return fillColor;
    }

    /**
     * Returns the area of the whole figure.
     * Subclasses must override this method with their own calculations.
     * @return The figure's area in squaremeters.
     */
    public abstract double getArea();

    /**
     * Returns the scope of the whole figure.
     * Subclasses must override this method with their own calculations.
     * @return The figure's scope in meters.
     */
    public abstract double getScope();
}
