package com.advance.dayone;

import java.util.Scanner;

public class IfConditionExample {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter value for temp");
        int temp=scanner.nextInt();


        if(temp==100)
            System.out.println("TEmp is 100");
        else
            System.out.println("Temp is not 100");

    }
}
