package bt3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DivisionTest {

    @Test
    public void testDivisionWithValidInputs() {
        double result = Division.division(10.0, 2.0);
        assertEquals(5.0, result, 0.0001);

        result = Division.division(7.5, 3.0);
        assertEquals(2.5, result, 0.0001);
    }

    @Test
    public void testDivisionWithZero() {
        double result = Division.division(0.0, 5.0);
        assertEquals(0.0, result, 0.0001);
    }
}
