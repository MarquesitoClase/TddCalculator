import calculator.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class calculatorTest {
    Calculator calculator = new Calculator();
    public void IntegerSumTest(){
        assertEquals(4, calculator.Sum(1, 3));
    }
    public void integerRestTest(){
        assertEquals(1, calculator.Rest(4,1));
        assertEquals(-1, calculator.Rest(2, 3));
        assertThrows(Exception.class, ()->calculator.Rest(1, "2"));
    }
    public void integerProductTest(){
        assertEquals(4, calculator.Product(2,2));
        assertEquals(-4, calculator.Product(2,-2));
    }
    public void integerDivisionTest(){
        assertEquals(1, calculator.integerDivision(2,2));
        assertEquals(2, calculator.integerDivision(4,2));
        assertEquals(2, calculator.integerDivision(5, 2));
    }
    public void doubleDivisionTest(){
        assertEquals(1, calculator.doubleDivision(2.0, 2.0));
        assertEquals(2.5, calculator.doubleDivision(5, 2.0));
    }
}
