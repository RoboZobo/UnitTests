import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CalculatorIsPositiveTest {
    public Calculator calculator;

    @BeforeAll
    public void setupCalculator() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Test of isPositive with positive value on Calculator")
    public void testCalculatorIsPositiveTrue() {
        assertTrue(calculator.isPositive(100));
    }

    @Test
    @DisplayName("Test of isPositive with negative value on Calculator")
    public void testCalculatorIsPositiveFalse() {
        assertFalse(calculator.isPositive(-100));
    }

    @AfterAll
    public void endOfTest() {
        System.out.println("All tests are finished");
    }

}
