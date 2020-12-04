/**
 * This class contains some methods for sorting double arrays.
 * {@link java.util.Arrays} should not be used in any implementation inside this class.
 */
public class ArraySort {

    /**
     * Don't let anyone instantiate this class.
     */
    private ArraySort() {}

    /**
     * Sorts a {@code double} array in ascending order.
     *
     * @param   array   an unsorted array.
     */
    public static void sort(double[] array) {
        // TODO implement method
        java.util.Arrays.sort(array);
    }

    /**
     * Swaps the values at two indices of a {@code double} array.
     *
     * @param   array   an array.
     * @param   index1  an index in the range 0...{@code array.length}.
     * @param   index2  an index in the range 0...{@code array.length}.
     */
    public static void swap(double[] array, int index1, int index2) {
        // TODO implement method
    }
}