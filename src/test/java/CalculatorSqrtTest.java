import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CalculatorSqrtTest {
    public Calculator calculator;

    @BeforeAll
    public void setupCalculator() {
        calculator = new Calculator();
    }

    @ParameterizedTest
    @CsvSource({"5.0, 25.0", "12.0, 144.0"})
    @DisplayName("Test of sqrt on Calculator")
    public void testCalculatorSqrt(double expectedResult, double value) {
        assertEquals(expectedResult, calculator.sqrt(value));
    }

    @AfterAll
    public void endOfTest() {
        System.out.println("All tests are finished");
    }

}
