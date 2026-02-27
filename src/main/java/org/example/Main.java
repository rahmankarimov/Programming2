package org.example;

import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


    HashMap<String, Integer> map = new HashMap<>();
    map.put("John", 10);
    map.put("Jane", 20);
    map.put("Jack", 30);
    System.out.println(map.get("John"));

    int hash = map.hashCode();
        System.out.println(hash );
        int hash2 = map.hashCode();
        System.out.println(hash2);
}}