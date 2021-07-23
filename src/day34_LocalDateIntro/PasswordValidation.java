package day34_LocalDateIntro;

public class PasswordValidation {
    public static void main(String[] args) {
        String password = "Cyb3rtek1!";

        boolean r1 = password.length() >= 8 && !password.contains(" ");
        boolean r2 = false,
                r3 = false,
                r4 = false,
                r5 = false;

        for (char each : password.toCharArray()) {
            if (Character.isUpperCase(each)){
                r2 = true;
            }else if(Character.isLowerCase(each)){
                r3 = true;
            }else if (Character.isDigit(each)){
                r4 = true;
            }else{
                r5 = true;
            }

        }
        boolean isStrongPassword = r1 && r2 && r3 && r4 && r5;

        System.out.println("isStrongPassword = " + isStrongPassword);

        if (!r1){
            System.out.println("The password does not have 8 characters or it contains space");
        }
        if (!r2){
            System.out.println("The password does not have upper case letter");
        }
        if (!r3){
            System.out.println("The password does not have lower case letter");
        }
        if (!r4){
            System.out.println("The password does not have a digit");

        }
        if (!r5){
            System.out.println("The password does not have a special character");
        }



    }
}
/*
PasswordValidation:
    Write a program that can verify if a password is a strong password. Characteristics of strong passwords are:
                1.  Password MUST be at least have 8 characters long, and should not contain space
                2.  PassWord should at least contain one uppercase letter
                2.1 Password should at least contain one lowercase letter
                3.  Password should at least contain one special characters
                4.  Password should at least contain a digit
 */