/**
 * This class contains some useful methods for math.
 * It is not meant to be used in real code as the algorithms are inefficient,
 * but instead for exercise purposes only.
 * {@link java.lang.Math} should not be used in any implementation inside this class.
 */
public class Math {

    /**
     * Don't let anyone instantiate this class.
     */
    private Math() {}

    /**
     * Returns the rounded positive square root of a {@code double} value.
     * The result is the {@code double} value closest to
     * the true mathematical square root of the argument value.
     *
     * @param   a   a value >= 0.
     * @return  the positive square root of {@code a}.
     */
    public static double sqrt(double a) {
        // TODO implement method
        return java.lang.Math.sqrt(a);
    }

    /**
     * Returns the value of the first argument raised to the power of the
     * second argument. Special cases:
     *
     * <ul>
     * <li>If the second argument is zero, then the result is 1.0.
     * <li>If the second argument is 1.0, then the result is the same as the
     * first argument.
     * </ul>
     *
     * @param   a   the base >= 0.
     * @param   b   the exponent >= 0.
     * @return  the value {@code a}<sup>{@code b}</sup>.
     */
    public static double pow(double a, double b) {
        // TODO implement method
        return java.lang.Math.pow(a, b);
    }

    /**
     * Returns the closest {@code long} to the argument.
     *
     * @param   a   a floating-point value to be rounded to a
     *          {@code long}.
     * @return  the value of the argument rounded to the nearest
     *          {@code long} value.
     */
    public static long round(double a) {
        // TODO implement method
        return java.lang.Math.round(a);
    }
}