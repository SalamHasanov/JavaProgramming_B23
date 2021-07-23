package day25_ForEachLoop;

public class ReversedElement2 {
    public static void main(String[] args) {

        String[] array = {"Java", "Python", "C#", "Cybertek"};

        for (String element :
                array) {
            String reverse = "";
            for (int i = element.length()-1; i >= 0 ; i--) {
                reverse += element.charAt(i);
            }
            System.out.println(reverse);
        }

    }
}
