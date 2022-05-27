package com.learning;

public class Main {
     public static void main(String[] args) {
         int a = 10;
         int b = a;
         a = 100;

       System.out.println("a = " + a + " - b = " + b);

      
        Person John = new Person("John");
        Person Jake = John;

        System.out.println("Before changing John");
        System.out.println(John.name + " " + Jake.name);
        
        John.name = "Johnte";

        System.out.println("After changing John");
        System.out.println(John.name + " " + Jake.name);
     }

     static class Person{
         String name;
         Person(String name){
             this.name = name;
            }
     }
}
