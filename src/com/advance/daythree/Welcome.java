package com.advance.daythree;

import java.util.Date;
import java.util.Iterator;

public class Welcome {
    public static  void main(String[] args){
        Customer cust1=new Customer();
        System.out.println(cust1);

        Customer cust2=new Customer("regular101","Manish","Bangalore",
                93454545,new Products("Iphone",98000,new Date()));
        System.out.println(cust2);

      }
}
