package replit_tasks;

import java.util.Scanner;

public class GiftCard {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter item:");
        String item = scan.nextLine();
        int price = 0;
        String result = "";

        if (item.equals("Blanket")){
            price = 60;
        }else if (item.equals("Charger")){
            price = 15;
        }else if (item.equals("Hat")){
            price = 25;
        }else if (item.equals("Headphones")){
            price = 30;
        }else if (item.equals("Laptop")){
            price = 200;
        }else if (item.equals("Pants")){
            price = 50;
        }else if (item.equals("Pillow")){
            price = 40;
        }else if (item.equals("Smartphone")){
            price = 1000;
        }else if (item.equals("Socks")){
            price = 5;
        }else if (item.equals("USB cable")){
            price = 10;
        }else{
            result = "Invalid item!";
        }

        if (price < 100 && !result.equals("Invalid item!")){
            price = 100 - price;
            if (price >= 85){
                result = "Thank you for your purchase!\n";
            }else{
                result = "Thank you for your purchase! \n";
            }
            result += "Your current balance is: "+price+"$";
        }else if (price > 100 && !result.equals("Invalid item")){
            result = "Sorry, not enough funds on your gift card!";
        }
        System.out.println(result);


    }
}
