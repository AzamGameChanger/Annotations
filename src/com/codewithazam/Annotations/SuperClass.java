package com.codewithazam.Annotations;

import java.util.ArrayList;

public class SuperClass {
    public void show(){
        System.out.println("I'm your daddy mf.");
    }

    //SuppressWarnings has 2 types: "unchecked" and "deprecated".
    @SuppressWarnings("unchecked")
    public static void printList() {
        ArrayList myList = new ArrayList<>();
        myList.add("Java is a programming language.");
        System.out.println(myList);
    }
}
