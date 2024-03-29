import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CalculatorTgTest {
    public Calculator calculator;

    @BeforeAll
    public void setupCalculator() {
        calculator = new Calculator();
    }

    @Disabled("Here is the bug, because of return sin(a) in implemented method cos(double a)")
    @ParameterizedTest
    @CsvSource({"60.0", "45.0"})
    @DisplayName("Test of tg on Calculator")
    public void testCalculatorTg(double value) {
        assertEquals(Math.tan(value), calculator.tg(value));
    }

    @AfterAll
    public void endOfTest() {
        System.out.println("All tests are finished");
    }

}
