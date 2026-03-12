import calculator.CalculatorService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceTest {
    CalculatorService calculator = new CalculatorService();

    @Test
    public void IntegerSumTest(){
        assertEquals(4, calculator.Sum(1, 3));
    }

    @Test
    public void integerRestTest(){
        assertEquals(1, calculator.Rest(4,3));
        assertEquals(-1, calculator.Rest(2, 3));
    }

    @Test
    public void integerProductTest(){
        assertEquals(4, calculator.Product(2,2));
        assertEquals(-4, calculator.Product(2,-2));
    }

    @Test
    public void integerDivisionTest(){
        assertEquals(1, calculator.IntegerDivision(2,2));
        assertEquals(2, calculator.IntegerDivision(4,2));
        assertEquals(2, calculator.IntegerDivision(5, 2));
        assertThrows(ArithmeticException.class, () -> calculator.IntegerDivision(5, 0));
    }

    @Test
    public void doubleSumTest(){
        assertEquals(1.0, calculator.DoubleSum(0.0, 1.0));
        assertEquals(0.0, calculator.DoubleSum(1.0, -1.0));
    }
    @Test
    public void doubleRestTest(){
        assertEquals(1.0, calculator.DoubleRest(1.0, 0.0));
        assertEquals(0.0, calculator.DoubleRest(1.0, 1.0));
        assertEquals(-1.0, calculator.DoubleRest(0.0, 1.0));
    }

    @Test
    public void doubleProductTest(){
        assertEquals(4d, calculator.DoubleProduct(2d,2d));
        assertEquals(-5.0, calculator.DoubleProduct(2.5,-2));
        assertEquals(4d, calculator.DoubleProduct(2,2));
    }
    @Test
    public void doubleDivisionTest(){
        assertEquals(1, calculator.DoubleDivision(2.0, 2.0));
        assertEquals(2.5, calculator.DoubleDivision(5, 2.0));
        assertThrows(ArithmeticException.class, () -> calculator.DoubleDivision(5, 0));
    }
}
