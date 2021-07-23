package day34_LocalDateIntro;

import java.beans.beancontext.BeanContextChild;

public class WrapperClassMethods {
    public static void main(String[] args) {

        String str = "123";

        int num = Integer.valueOf(str);
        // wrapper class
        System.out.println(num-1);

        Integer num2 =Integer.parseInt(str);
        // ing primitive AUTOBOXING

        int num3 = Integer.parseInt(str);
        // int primitive

        Integer num4 = Integer.valueOf(str);
        // wrapper class

        String s = "a1b2c3";
        int sum = 0;

        for (char each : s.toCharArray()) {
            if( Character.isDigit(each)){
                sum += Integer.parseInt(""+each);

            }

        }
        System.out.println(sum);

        System.out.println("________________________________________");


        String s2 = "AAABBBC123CC!@#$%@!$%^43&";

        String letters = "",
                digits = "",
                specialChars = "";

        for (char each : s2.toCharArray()) {
            if (Character.isDigit(each)){
                digits += each;
                }else if(Character.isLetter(each)){
                letters += each;
            }else{
                specialChars += each;
            }

        }
        System.out.println(letters);
        System.out.println(digits);
        System.out.println(specialChars);


    }
}
