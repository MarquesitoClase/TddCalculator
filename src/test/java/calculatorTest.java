import org.calculator.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class calculatorTest {
    Calculator calculator = new Calculator();
    public void IntegerSumTest(){
        assertEquals(4, calculator.Sum(1, 3));

    }
}
