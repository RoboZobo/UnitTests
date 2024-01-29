import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Execution(ExecutionMode.CONCURRENT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CalculatorSubTest {
    public Calculator calculator;

    @BeforeAll
    public void setupCalculator() {
        calculator = new Calculator();
    }

    @ParameterizedTest
    @CsvSource({"1.0, 3.0, 2.0", "-10.0, 70.0, 80.0"})
    @DisplayName("Test of subtraction with Calculator for doubles")
    public void testCalculatorSub(double expectedResult, double firstValue, double secondValue) {
        assertEquals(expectedResult, calculator.sub(firstValue, secondValue));
    }

    @ParameterizedTest
    @CsvSource({"1, 3, 2", "-10, 70, 80"})
    @DisplayName("Test of subtraction with Calculator for longs")
    public void testCalculatorSub(long expectedResult, long firstValue, long secondValue) {
        assertEquals(expectedResult, calculator.sub(firstValue, secondValue));
    }

    @AfterAll
    public void endOfTest() {
        System.out.println("All tests are finished");
    }

}
