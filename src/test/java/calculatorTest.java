import org.calculator.Calculator;

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
}
