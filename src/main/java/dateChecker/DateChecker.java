package dateChecker;

public class DateChecker {

    public boolean has31Days(Month month) {
        if (month == null) {
            throw new IllegalArgumentException("Month cannot be null");
        }

        return switch (month) {
            case JANUARY, 
                MARCH, 
                MAY, 
                JULY, 
                AUGUST, 
                OCTOBER, 
                DECEMBER -> true;
            case FEBRUARY -> false;     // Handle February explicitly for having 28 or 29 days
            default -> false;           // else 30 days
        };
    }
}
