package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void sumOfTwoPositiveNumbers() {
        assertEquals(5, calculator.sum(2, 3));
    }

    @Test
    void subtractSmallerFromLarger() {
        assertEquals(6, calculator.subtract(10, 4));
    }

    @Test
    void subtractLargerFromSmallerGivesNegative() {
        assertEquals(-6, calculator.subtract(4, 10));
    }
}
