package com.advance.daythree;

import java.util.ArrayList;
import java.util.Iterator;

import static kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.iterator;
import static kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.list;

public class ArrayLClass {
    public static void main(String[] args){
        ArrayList<String> al=new ArrayList<String>();
        al.add("sharath");
        al.add("kp");
        al.add("123");
        Iterator <String> e= al.iterator();
        while (e.hasNext()){
            System.out.println(e.next());
            e.remove();
        }
        for(String str:al){
            System.out.println(str);
        }
    }
}
