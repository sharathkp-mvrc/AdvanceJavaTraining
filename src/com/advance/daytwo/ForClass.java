package com.advance.daytwo;

public class ForClass {
    public static void main(String[] args){
       /* int i=0;
        for(;;){
            if(i>10){
               break;
            }
            System.out.println("Value of i : "+i);
            i++;
        }*/
       /* int i=10;
        for(;;){
            if(i<0){
                break;
            }
            System.out.println("Value of i : "+i);
            i--;
        }*/
       String[] str={"me","you","they","those"};
       for(String name:str){
           System.out.println(name);
           char[] chArray=name.toCharArray();
           for (char ch:chArray){
               System.out.println(ch);
           }
       }
       int[] numbers={10,20,30,40,50};
       for (int i=numbers.length-1;i>=0;i--){
           System.out.println(numbers[i]);
       }
       for(int i:numbers){
           System.out.println(i);
       }
    }
}
