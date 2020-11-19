package com.codewithazam.Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

//Customized  annotation
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface CustomAnnotation {
    String str()  default "Amin";
    int numbers();
    String engineer() default "[unassigned]";
    String date() default "[unknown]";
}
