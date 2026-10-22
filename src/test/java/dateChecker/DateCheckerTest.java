package dateChecker;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DateCheckerTest {

    private final DateChecker dateChecker = new DateChecker();

    @Test
    void marchHas31Days() {
        assertTrue(dateChecker.has31Days(Month.MARCH), "March should have 31 days");
    }

    @Test
    void januaryHas31Days() {
        assertTrue(dateChecker.has31Days(Month.JANUARY), "January should have 31 days");
    }

    @Test
    void aprilDoesNotHave31Days() {
        assertFalse(dateChecker.has31Days(Month.APRIL), "April should not have 31 days");
    }

    @ParameterizedTest
    @EnumSource(value = Month.class, names = {
            "JANUARY",
            "MARCH",
            "MAY",
            "JULY",
            "AUGUST",
            "OCTOBER",
            "DECEMBER"
        }
    )
    void testMonthsWith31Days(Month month) {
        assertTrue(dateChecker.has31Days(month), month + " should have 31 days");
    }
}
