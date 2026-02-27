package org.example;

public class Animal {
    String name;

    protected Animal(String name){
        this.name = name;
    }
    public void run(){
        System.out.println(name+" is running");
    }
}
