package day16_String;

public class EmailDomain {
    public static void main(String[] args) {
        String email = "cybertek@gmail.com";

        int beginningIndex = email.indexOf("@") + 1;
        int endingIndex = email.indexOf(".");
        String domain = email.substring(beginningIndex,endingIndex);

        System.out.println("domain = " + domain);
    }
}
