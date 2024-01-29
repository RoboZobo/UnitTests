import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CalculatorSumTest {
    public Calculator calculator;

    @BeforeAll
    public void setupCalculator() {
        calculator = new Calculator();
    }

    @ParameterizedTest
    @CsvSource({"5.0, 3.0, 2.0", "150.0, 70.0, 80.0"})
    @DisplayName("Test of sum with Calculator for doubles")
    public void testCalculatorSum(double expectedResult, double firstValue, double secondValue) {
        assertEquals(expectedResult, calculator.sum(firstValue, secondValue));
    }

    @ParameterizedTest
    @CsvSource({"5, 3, 2", "150, 70, 80"})
    @DisplayName("Test of sum with Calculator for longs")
    public void testCalculatorSum(long expectedResult, long firstValue, long secondValue) {
        assertEquals(expectedResult, calculator.sum(firstValue, secondValue));
    }

    @AfterAll
    public void endOfTest() {
        System.out.println("All tests are finished");
    }

}
