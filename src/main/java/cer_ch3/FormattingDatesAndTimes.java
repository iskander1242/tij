package cer_ch3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormattingDatesAndTimes {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2019, 10, 12);
        System.out.println(localDate.format(DateTimeFormatter.ISO_LOCAL_DATE));

        LocalTime localTime = LocalTime.of(12, 12, 12);
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);

        System.out.println(localDateTime
                .format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

        DateTimeFormatter shortDateFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println("shortDateFormatter.format: " + shortDateFormatter.format(localDateTime));
        System.out.println("shortDateFormatter.format: " + shortDateFormatter.format(localDate));
//        System.out.println(shortDateTime.format(localTime)); //todo: UnsupportedTemporalTypeException: Unsupported field: MonthOfYear

        System.out.println("localDateTime.format: " + localDateTime.format(shortDateFormatter));
        System.out.println("localDate.format: " + localDate.format(shortDateFormatter));
//        System.out.println("localDateTime: "+localTime.format(shortDateTime)); //todo: UnsupportedTemporalTypeException: Unsupported field: MonthOfYear

        //todo: SHORT and MEDIUM
        LocalDate localDate1 = LocalDate.of(2019, 10, 12);
        LocalTime localTime1 = LocalTime.of(12, 12, 12);
        LocalDateTime localDateTime1 = LocalDateTime.of(localDate1, localTime1);
        System.out.println("FormatStyle.SHORT::format: " + DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).format(localDateTime1));
        System.out.println("FormatStyle.MEDIUM::format: " + DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).format(localDateTime1));

        DateTimeFormatter custom = DateTimeFormatter.ofPattern("MMMM dd, yy, hh:mm");
        System.out.println("custom::format: " + custom.format(localDateTime1));

        //todo: Parsing date and time
        LocalDate parsedDate = LocalDate.parse("01 12, 2008", DateTimeFormatter.ofPattern("MM dd, yyyy"));
        System.out.println("parse:" + parsedDate);
        System.out.println(LocalTime.parse("11:22"));
    }
}
