import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CalculatorCtgTest {
    public Calculator calculator;

    @BeforeAll
    public void setupCalculator() {
        calculator = new Calculator();
    }

    @ParameterizedTest
    @CsvSource({"60.0", "45.0"})
    @DisplayName("Test of ctg on Calculator")
    public void testCalculatorCtg(double value) {
        assertEquals(Math.cos(value) / Math.sin(value), calculator.ctg(value), "here is the bug, because of return tanh(a) in implemented method ctg(double a). Should be Math.cos(value) / Math.sin(value)");
    }

    @AfterAll
    public void endOfTest() {
        System.out.println("All tests are finished");
    }

}
