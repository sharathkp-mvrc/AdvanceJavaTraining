package com.advance.dayone;

import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number");
        int num1=scanner.nextInt();

        System.out.println("Enter second number");
        int num2=scanner.nextInt();

        System.out.println("1] Addition \n2] Substraction\n3] Multiplication\n4] Division\n\n\nEnter your Choice");
        int choice=scanner.nextInt();

        switch (choice){
            case 1:
                System.out.println("Addition"+(num1+num2));
                break;
            case 2:
                System.out.println("Subtraction"+(num1=num2));
                break;
            case 3:
                System.out.println("Multiplication"+(num1*num2));
                break;
            case 4:
                System.out.println("Division"+(float)(num1/(float)num2));
                break;
            default:
                System.out.println("Wrong choice");
        }
    }
}
