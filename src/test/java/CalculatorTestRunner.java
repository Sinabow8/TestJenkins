import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;

public class CalculatorTestRunner {
    public static void main(String[] args) {
        org.junit.runner.Result result = JUnitCore.runClasses(CalculatorTest.class);
        for (Failure failure : result.getFailures()){
            System.out.println(failure.toString());
        }
    }
}