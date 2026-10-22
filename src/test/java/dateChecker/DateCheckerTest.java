package dateChecker;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DateCheckerTest {

    private final DateChecker dateChecker = new DateChecker();

    @Test
    void marchHas31Days() {
        assertTrue(dateChecker.has31Days(Month.MARCH), "March should have 31 days");
    }
}
