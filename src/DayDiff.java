import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * To calculate the dates between
 *
 * @author Vinod John
 * @Date 10.12.2023
 */
public class DayDiff {

    // Parameterized constructor
    public DayDiff (String nextClassDateStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MMM-dd");
        formatter.withLocale(Locale.ENGLISH);

        LocalDate nextClassDate = LocalDate.parse(nextClassDateStr, formatter);

        Duration duration = Duration.between(LocalDateTime.now(), nextClassDate.atStartOfDay());

        System.out.printf("%nMy next SDA class is in %d days", duration.toDays());
    }
}
