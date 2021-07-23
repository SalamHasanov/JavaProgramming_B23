package day34_LocalDateIntro;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalTimeIntro {
    public static void main(String[] args) {

        LocalTime now = LocalTime.now();
        System.out.println(now);

        LocalTime breakTime = now.plusMinutes(15);
        System.out.println(breakTime);

        LocalDate date = LocalDate.of(2021,8,5);
        LocalTime time = LocalTime.of(17,45);

        LocalDateTime dateTime = LocalDateTime.of(date,time);

        System.out.println(dateTime);


    }
}
