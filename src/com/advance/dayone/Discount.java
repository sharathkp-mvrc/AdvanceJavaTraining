package com.advance.dayone;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int laptop_price=300;
        System.out.println("Enter quantity of laptop");
        int laptop_quantity = scanner.nextInt();
        int usb_price=50;
        System.out.println("Enter quantity of usb");
        int usb_quantity = scanner.nextInt();
        int keyboard_price=20;
        System.out.println("Enter quantity of keyboard");
        int keyboard_quantity = scanner.nextInt();
        double total_amount=(laptop_price*laptop_quantity+usb_price*usb_quantity+keyboard_price*keyboard_quantity);
        boolean discount_applicable=(total_amount>1500?true:false);
        if (discount_applicable==true) {
            double discount = 0.15 * total_amount;
            System.out.println("discount is "+discount);
        }
        if(total_amount>1500)
        {
             total_amount=total_amount-0.15*1500;
        }
        else
        {
            System.out.println(total_amount);
        }

        System.out.println("total amount is "+total_amount);
    }
}
