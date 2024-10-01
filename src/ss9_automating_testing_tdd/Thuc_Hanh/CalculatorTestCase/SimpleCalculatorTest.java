package ss9_automating_testing_tdd.Thuc_Hanh.CalculatorTestCase;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleCalculatorTest {
    @Test
    @DisplayName("Testing add 0 + 0")
    public void testAdd0And0(){
        int expected = 0;
        int result = SimpleCalculator.add(0, 0);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Testing add 1 + 0")
    public void testAdd1And0(){
        int expected = 1;
        int result = SimpleCalculator.add(1, 0);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Testing add 0 + 0")
    public void testAdd0And1(){
        int expected = 1;
        int result = SimpleCalculator.add(0, 1);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Testing add 1 + 1")
    public void testAdd1And1(){
        int expected = 2;
        int result = SimpleCalculator.add(1, 1);
        assertEquals(expected, result);
    }

}