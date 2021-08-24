package com.advance.daytwo;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){
        System.out.println("Enter the string");
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        String reversedString="";
        int i=str.length()-1;
        do{
            reversedString+=str.charAt(i);
            i--;
        }while (i>=0);
        if(str.equals(reversedString))
        System.out.println("palindrome");
        else
            System.out.println("not palindrome");

    }
}
