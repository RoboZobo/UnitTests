import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CalculatorPowTest {
    public Calculator calculator;

    @BeforeAll
    public void setupCalculator() {
        calculator = new Calculator();
    }

    @ParameterizedTest
    @CsvSource({"9.0, 3.0, 2.0", "343000.0, 70.0, 3.0"})
    @DisplayName("Test of pow with Calculator for doubles")
    public void testCalculatorPow(double expectedResult, double firstValue, double secondValue) {
        assertEquals(expectedResult, calculator.pow(firstValue, secondValue));
    }

    @AfterAll
    public void endOfTest() {
        System.out.println("All tests are finished");
    }

}
