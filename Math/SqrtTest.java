import org.junit.Test;
import org.junit.Before;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class SqrtTest {
    private static final double DELTA = 0.0001;

    private Random random;

    @Before
    public void initialize() {
        random = new Random();
    }

    @Test
    public void testInteger() {
        for (int i = 0; i < 10; i++) {
            double sqrt = i;
            double x = sqrt * sqrt;
            double testSqrt = Math.sqrt(x);
            assertEquals(sqrt, testSqrt, DELTA);
        }
    }

    @Test
    public void testRandomInteger() {
        for (int i = 0; i < 100; i++) {
            double x = random.nextInt();
            double sqrt = java.lang.Math.sqrt(x);
            double testSqrt = Math.sqrt(x);
            assertEquals(sqrt, testSqrt, DELTA);
        }
    }

    @Test
    public void testFractions() {
        for (int i = 0; i < 10; i++) {
            double sqrt = 1.0/i;
            double x = sqrt * sqrt;
            double testSqrt = Math.sqrt(x);
            assertEquals(sqrt, testSqrt, DELTA);
        }
    }

    @Test
    public void testRandomDecimal() {
        for (int i = 0; i < 100; i++) {
            double x = random.nextInt();
            double sqrt = java.lang.Math.sqrt(x);
            double testSqrt = Math.sqrt(x);
            assertEquals(sqrt, testSqrt, DELTA);
        }
    }
}