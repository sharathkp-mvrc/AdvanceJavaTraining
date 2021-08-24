package com.advance.dayone;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter value of sub1");
        int sub1=scanner.nextInt();
        System.out.println("Enter value of sub2");
        int sub2=scanner.nextInt();
        System.out.println("Enter value of sub3");
        int sub3=scanner.nextInt();
        System.out.println("Enter value of sub4");
        int sub4=scanner.nextInt();
        System.out.println("Enter value of sub5");
        int sub5=scanner.nextInt();

        int avg=(sub1+sub2+sub3+sub4+sub5)/5;
        if(avg>85)
            System.out.println("grade is a");
        else if (avg>70 && avg<85)
            System.out.println("grade is b");
        else if (avg>50 && avg<70)
            System.out.println("grade is c");
        else if ( avg<50)
            System.out.println("grade is d");



    }
}
