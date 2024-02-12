package DateTime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class PeriodEx {

  public static void main(String[] args) {
    // Instant il = Instant.now();
    // System.out.println(il);

    // LocalDate Date = LocalDate.now();
    // System.out.println(Date);
    // System.out.println(Date.plusDays(1));
    // System.out.println(Date.getDayOfMonth());
    // System.out.println(Date.getChronology());
    // System.out.println(Date.isLeapYear());
    // System.out.println(Date.withDayOfMonth(30));
    // System.out.println(Date.of(2023, Month.FEBRUARY, 28));

    // ZonedDateTime z1 = ZonedDateTime.now();
    // ZonedDateTime z2 = ZonedDateTime.now(ZoneId.of("Australia/Sydney"));

    // System.out.println(z1);
    // System.out.println(z2);

    //period duration

    // LocalDate end = LocalDate.now();
    // LocalDate start = LocalDate.of(1950, Month.FEBRUARY, 1);

    // Period p = start.until(end);
    // System.out.println(p.get(ChronoUnit.DAYS));
    // System.out.println(p);

    DateTimeFormatter format = DateTimeFormatter.ofLocalizedDate(
      FormatStyle.LONG
    );
    DateTimeFormatter format1 = DateTimeFormatter.ofPattern("MM/yyyy/dd");
    String text = "11/2012/12u8";

    LocalDate d2 = LocalDate.parse(text, format1);
    System.out.println(d2);
  }
}
