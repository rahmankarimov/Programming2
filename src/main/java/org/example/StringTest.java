package org.example;

public class StringTest {
    public static void main(String[] args) {

        String name = "Sala";
        String name2 = "Salam";
        String name3 = new String("Salam");
        String name4 = new String("Salam");
        String str = "Hello all";

        String str3 = str;

        str3 = "Hello";

        System.out.println("str3 + "+str3);
        System.out.println(str);

        System.out.println(name == name2);
    }

}
