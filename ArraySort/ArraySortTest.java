import org.junit.Test;
import org.junit.Before;

import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.assertTrue;

public class ArraySortTest {
    private Random random;

    @Before
    public void initialize() {
        random = new Random();
    }

    @Test
    public void testPositive() {
        for (int i = 0; i < 10; i++) {
            // Define arrays
            double[] array = new double[100];
            double[] internalArray = new double[array.length];

            // Randomly fill array with positive numbers
            for (int j = 0; j < array.length; j++) {
                internalArray[j] = array[j] = Math.abs(random.nextDouble());
            }

            // Sort arrays
            Arrays.sort(internalArray);
            ArraySort.sort(array);

            // Test
            assertTrue(Arrays.equals(internalArray, array));
        }
    }

    @Test
    public void testNegative() {
        for (int i = 0; i < 10; i++) {
            // Define arrays
            double[] array = new double[100];
            double[] internalArray = new double[array.length];

            // Randomly fill array with positive numbers
            for (int j = 0; j < array.length; j++) {
                internalArray[j] = array[j] = -Math.abs(random.nextDouble());
            }

            // Sort arrays
            Arrays.sort(internalArray);
            ArraySort.sort(array);

            // Test
            assertTrue(Arrays.equals(internalArray, array));
        }
    }

    @Test
    public void testRandom() {
        for (int i = 0; i < 10; i++) {
            // Define arrays
            double[] array = new double[100];
            double[] internalArray = new double[array.length];

            // Randomly fill array with positive numbers
            for (int j = 0; j < array.length; j++) {
                internalArray[j] = array[j] = random.nextDouble();
            }

            // Sort arrays
            Arrays.sort(internalArray);
            ArraySort.sort(array);

            // Test
            assertTrue(Arrays.equals(internalArray, array));
        }
    }
}