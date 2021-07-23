package day09_ifStatements;

public class DaysInMonth {

    public static void main(String[] args) {
        int month = 1;

        boolean has28Days = month == 2;
        boolean has30Days = month == 4 || month == 6 || month == 9 || month == 11;
        boolean has31Days = !has28Days && !has30Days;
        // boolean has31Days = month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12;

        if (has28Days){
            System.out.println("28 Days");
        }
        if (has30Days){
            System.out.println("30 Days");
        }
        if (has31Days){
            System.out.println("31 Days");
        }


    }
}
