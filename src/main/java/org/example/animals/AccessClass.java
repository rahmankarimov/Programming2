package org.example.animals;

class AccessClass {
    public int a = 5;
    private int b = 10;
    protected int c = 15;



    public static void main(String args[]) {
            AccessClass ac = new AccessClass();
            System.out.println("a = "+ac.a);
            System.out.println("b = "+ac.b); // error
            System.out.println("c = "+ac.c);
        }
}