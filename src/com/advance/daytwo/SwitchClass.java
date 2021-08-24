package com.advance.daytwo;

import jdk.internal.util.xml.impl.Input;

import java.util.Scanner;

public class SwitchClass {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Two numbers :");

        int num1=scan.nextInt();
        int num2=scan.nextInt();
        char ch;
        do{
            System.out.println();
            System.out.println("Choose :");
            System.out.println();
            System.out.println("1] ADD \n 2] SUB \n 3] MUL 4] DIV");
            int key=scan.nextInt();
            switch (key) {
                case 1:
                    System.out.println(num1 + num2);
                    break;
                case 2:
                    System.out.println(num1 - num2);
                    break;
                case 3:
                    System.out.println(num1 * num2);
                    break;
                case 4:
                    System.out.println(num1 / num2);
                    break;
                default:
                    System.out.println("Thank you");
            }
            System.out.println();
            System.out.println("Want to continue : y/n");
            ch=scan.next().charAt(0);
        }while (ch=='y' || ch=='n');
    }
}
