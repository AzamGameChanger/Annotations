package com.codewithazam.Annotations;

@CustomAnnotation(numbers = 777)
public class MyAnnotations {
    private int numbers;
    private String name;
@CustomAnnotation(numbers = 777)
    public void get(){
        System.out.println("Get after it!");
    }
}
