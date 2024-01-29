import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CalculatorMultTest {
    public Calculator calculator;

    @BeforeAll
    public void setupCalculator() {
        calculator = new Calculator();
    }

    @ParameterizedTest
    @CsvSource({"6.0, 3.0, 2.0", "5600.0, 70.0, 80.0"})
    @DisplayName("Test of multiplication with Calculator for doubles")
    public void testCalculatorMult(double expectedResult, double firstValue, double secondValue) {
        assertEquals(expectedResult, calculator.mult(firstValue, secondValue));
    }

    @ParameterizedTest
    @CsvSource({"6, 3, 2", "5600, 70, 80"})
    @DisplayName("Test of multiplication with Calculator for longs")
    public void testCalculatorMult(long expectedResult, long firstValue, long secondValue) {
        assertEquals(expectedResult, calculator.mult(firstValue, secondValue));
    }

    @AfterAll
    public void endOfTest() {
        System.out.println("All tests are finished");
    }

}
