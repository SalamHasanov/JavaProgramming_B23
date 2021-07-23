package day34_LocalDateIntro;

import java.time.LocalDate;

public class BirthDay {
    public static void main(String[] args) {
        birthday(1989, 7,22);
    }


    public static void birthday (int year, int month, int day){
        LocalDate DOB = LocalDate.of(year,month,day);
        LocalDate today = LocalDate.now();

        int age = today.getYear() - DOB.getYear();
        if (DOB.getMonthValue()== today.getMonthValue() && DOB.getDayOfMonth() == today.getDayOfMonth()){
            System.out.println("Happy Birthday!");
            System.out.println("Today you are "+age+" years old!");

        }else
            System.out.println("Today is not your birthday");
    }
}
