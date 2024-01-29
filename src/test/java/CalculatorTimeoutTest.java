import com.epam.tat.module4.Timeout;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertTimeout;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CalculatorTimeoutTest {

    @BeforeAll
    public void setupCalculator() {
        System.out.println("Start of tests");
    }

    @Test
    @DisplayName("Test of timeout on Calculator")
    public void testCalculatorTimeout() {
        assertTimeout(Duration.ofSeconds(2), () -> Timeout.sleep(1));
    }

    @AfterAll
    public void endOfTest() {
        System.out.println("All tests are finished");
    }

}
