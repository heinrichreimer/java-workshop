import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import java.util.List;

public class ArraySortTestRunner {
    public static void main(String[] args) {
        Class[] tests = {ArraySortTest.class};
        for (Class test : tests) {
            System.out.println("Running test: " + test.getSimpleName());
            Result result = JUnitCore.runClasses(test);
            List<Failure> failures = result.getFailures();
            if (failures.isEmpty()) {
                System.out.println("Test completed without failures.");
            }
            else {
                System.out.println("Test completed with " + failures.size() + " failures.");
                for (Failure failure : failures) {
                    System.out.println(failure.toString());
                }
            }
        }
    }
}