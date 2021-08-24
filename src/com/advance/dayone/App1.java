package com.advance.dayone;

import java.util.Scanner;

public class App1 {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter 4 digit number");
        int number=scanner.nextInt();
        int sum=0;


           int last_digit=number%10;
           sum=last_digit*1;
           number=number/10;
            last_digit=number%10;
            sum=sum+last_digit*10;
            number=number/10;
        last_digit=number%10;
        sum=sum+last_digit*100;
        number=number/10;
        last_digit=number%10;
        sum=sum+last_digit*1000;
        number=number/10;




        System.out.println(sum);


    }
}
