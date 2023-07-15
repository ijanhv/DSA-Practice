package com.janhavi.OOP;

public class Main {

    public static void main(String[] args) {
        Box box = new Box();
        System.out.println(box.l);
        System.out.println(box.h);
        System.out.println(box.w);
//        box.information();

        Box cube = new Box(3);
        System.out.println(cube.l);

    }
}
