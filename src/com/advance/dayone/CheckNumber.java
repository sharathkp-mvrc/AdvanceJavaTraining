package com.advance.dayone;

import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value for temp");
        int number= scanner.nextInt();

        int count=0;
        while(number< 10)
        {
            number=number/10;
           count=count+1;
        }
        System.out.println(count);
    }
}
