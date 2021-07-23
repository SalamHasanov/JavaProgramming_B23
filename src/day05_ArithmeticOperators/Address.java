package day05_ArithmeticOperators;

public class Address {

    public static void main(String[] args) {

        String name = "Daniel Owens",
                city = "McLean",
                state = "VA",
                streetName = "Jones Branch Dr";
        int buildingNumber = 7925, zipCode = 22102;
        System.out.println(name);
        System.out.println(buildingNumber+" "+streetName);
        System.out.println(city+" "+state+" "+zipCode);


    }
}
/*
1. create a class named Address and declare the following variables:
        name, buildingNumber, streetName, city, state, zipCode

        use string concatenation to display the full address of the person

        Ex:
            Daniel Owens
            7925 Jones Branch Dr
            McLean VA 22102
 */