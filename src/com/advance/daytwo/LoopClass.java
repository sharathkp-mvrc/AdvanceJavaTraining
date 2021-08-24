package com.advance.daytwo;

import java.util.Scanner;

public class LoopClass {
public static void main(String[] args){
    /*while (i<=10){
        System.out.println(i);
        i++;
    }
    while (i>=1) {
        System.out.println(i);
        i--;
    }
    Scanner scan=new Scanner(System.in);
    int number=0;
    System.out.println("Enter number to iteration");
    int input= scan.nextInt();
    while (input>=1){
        number+=input;
        input--;
    }
    System.out.println("Result :"+number);*/

    Scanner scan=new Scanner(System.in);
    int number=0;
    System.out.println("Enter number to iteration");
    int input= scan.nextInt();
    do{
        number+=input;
        input--;
    }while(input>=0);
    System.out.println("Result :"+number);

}
}
