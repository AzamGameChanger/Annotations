package com.codewithazam.Annotations;

import java.util.List;

public class SubClass extends SuperClass {
    @Override
    public void show() {
        System.out.println("Yes, daddy. Im your child, you moron.");
    }
    @Deprecated
    public void print(List<String>... lists){
        for(List<String > list : lists)
            System.out.println(list);
    }
}
