import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TipCalculatorTest {
    @Test
    public void calculateTip() {
        var calculator = new TipCalculator();
        assertEquals(20, calculator.calculateTip(100.00, 20));

    }
}
