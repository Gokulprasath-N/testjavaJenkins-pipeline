import org.example.Calculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private Calculator calculator = new Calculator();

    @Test
    public void testDivideByZero() {
        try {
            calculator.divide(10, 0);
        } catch (ArithmeticException e) {
            assertEquals("Division by zero", "/ by zero", e.getMessage());
        }
    }
}
