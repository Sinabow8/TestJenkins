import org.junit.*;

import static org.junit.Assert.assertEquals;


public class CalculatorTest  {


    @Test
    public void multiplicationOfZeroIntegersShouldEqualZero() {
        Calculator calc = new Calculator();
        assertEquals(0,calc.multiply(0,10));
        assertEquals(0,calc.multiply(10,0));
        assertEquals(0, calc.multiply(0,0));
    }

    @Test
    public void sumOfOneAndTwoShouldEqualThree() {
        Calculator calc = new Calculator();
        assertEquals(3, calc.sum(1,2));
        assertEquals(3, calc.sum(2,1));
    }

    @Test
    public void divisionByZeroShouldThrowArithmeticException() throws ArithmeticException{
        Calculator calc = new Calculator();
        calc.divide(2,0);
    }
}
