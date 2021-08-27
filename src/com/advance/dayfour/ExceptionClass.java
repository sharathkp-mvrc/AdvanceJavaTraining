package com.advance.dayfour;

public class ExceptionClass {
    public static void main(String[] args){
        try{
            String str=null;
            System.out.println(str.length());
            int a[]={1,2,3,4,5};
            for(int i=0;i<=a.length;i++){
                System.out.println(a[i]);
            }
        }
        catch(Exception e){ //generic exeption
            System.out.println("Error : " +e);

        }
    }
}
