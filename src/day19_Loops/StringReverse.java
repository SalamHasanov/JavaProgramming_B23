package day19_Loops;

public class StringReverse {
    public static void main(String[] args) {
        String name = "Salam";

        String reverseName = "";

        for (int i = name.length()-1; i >= 0 ; i--) {
            reverseName += name.charAt(i);


        }
        System.out.println(reverseName);
    }
}
