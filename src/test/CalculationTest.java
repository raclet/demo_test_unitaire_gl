package test;

import com.Calculation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculationTest {

    @Test
    public void testFindMax() {
        assertEquals(3, Calculation.findMax(new int[]{1, 2, 3}));
    }

    @Test
    public void testFindMax2() {
        assertEquals(-1, Calculation.findMax(new int[]{-1, -2, -3}));
    }
}

