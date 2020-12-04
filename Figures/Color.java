public class Color {
    private int red;
    private int green;
    private int blue;
    
    public static final Color BLACK = new Color(0, 0, 0);

    /**
     * Constructs a new color with the given RGB values
     *
     * @param red The red componentin the range 0...255.
     * @param green The red componentin the range 0...255.
     * @param blue The red componentin the range 0...255.
     */
    public Color(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }
}