package com.janhavi.OOP;

public class Basic {
    private int age;
    private String name;

    public Basic(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public static void main(String[] args) {
        Basic kunal = new Basic(34, "Kunal");
        System.out.println(kunal.age);
        System.out.println(kunal.name);
    }
}
