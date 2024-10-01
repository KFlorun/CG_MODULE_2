package ss9_automating_testing_tdd.Thuc_Hanh.AbsoluteNumberTestCase;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AbsoluteNumberCalculatorTest {
    @Test
    void testFindAbsolute0() {
        int expected = 0;
        int result = AbsoluteNumberCalculator.findAbsolute(0);
        assertEquals(expected, result);
    }
    @Test
    void testFindAbsolute1() {
        int expected = 1;
        int result = AbsoluteNumberCalculator.findAbsolute(1);

    }

}
