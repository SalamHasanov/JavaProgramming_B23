package day34_LocalDateIntro;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateAndTimeFormatting {
    public static void main(String[] args) {
        DateTimeFormatter DF = DateTimeFormatter.ofPattern("MM/dd/YYYY");

        LocalDate today = LocalDate.now();
        today.format(DF);

        System.out.println(today.format(DF));

        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);

        DateTimeFormatter TF = DateTimeFormatter.ofPattern("hh:mm a");
        System.out.println(currentTime.format(TF));

        LocalDateTime a = LocalDateTime.now();
        DateTimeFormatter DTF = DateTimeFormatter.ofPattern("EEEE, hh:mm a, MMMM/dd/YYYY ");

        System.out.println(a.format(DTF));


    }
}

//  MM/dd/YYYY