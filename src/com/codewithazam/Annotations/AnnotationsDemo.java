package com.codewithazam.Annotations;

//Built-in Java Annotations
//--> @Override
//--> @Deprecated
//--> @SuppressWarnings

import java.util.Arrays;
import java.util.List;

public class AnnotationsDemo {
    public static void main(String[] args) {
        //@Override annotations
        SubClass child = new SubClass();
        child.show();

        //@SuppressWarnings annotations
        SuperClass.printList();

        //@deprecated annotations
        SubClass sub = new SubClass();
        List<String > universityLists = Arrays.asList("UCLA", "SDSU");
        sub.print();
    }
}
