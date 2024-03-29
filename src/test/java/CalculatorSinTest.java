import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CalculatorSinTest {
    public Calculator calculator;

    @BeforeAll
    public void setupCalculator() {
        calculator = new Calculator();
    }

    @ParameterizedTest
    @CsvSource({"60.0", "45.0"})
    @DisplayName("Test of sin on Calculator")
    public void testCalculatorSin(double value) {
        assertEquals(Math.sin(value), calculator.sin(value));
    }

    @AfterAll
    public void endOfTest() {
        System.out.println("All tests are finished");
    }

}
