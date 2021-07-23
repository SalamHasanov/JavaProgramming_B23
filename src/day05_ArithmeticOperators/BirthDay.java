package day05_ArithmeticOperators;

public class BirthDay {
    public static void main(String[] args) {
        String name = "John",
                birthMonth = "April";
        int birthDay = 15,
                birthYear = 1993;

        System.out.println(name+"was born on "+birthMonth+"/"+birthDay+"/"+birthYear+".");

        int age = 2021 - birthYear;
        System.out.println(name+" is "+age+" years old.");


    }
}
