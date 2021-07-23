package day35_ArrayList;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class WarmUpTask1 {
    public static void main(String[] args) {


        LocalDate[] dates = new LocalDate[100];


        for (int i = 0; i < dates.length; i++) {
            dates[i] = LocalDate.of(2021,7,18).plusDays(i+1);

        }
        System.out.println(Arrays.toString(dates));
        for (LocalDate each : dates) {
            System.out.println(each.format(DateTimeFormatter.ofPattern("M/dd/yyyy, EEE")));

        }

    }
}
