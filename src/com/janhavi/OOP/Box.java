package com.janhavi.OOP;

public class Box {
    double l;
    double h;
    double w;

    Box() {
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    Box(double side) {
        this.w = side;
        this.l = side;
        this.h = side;
    }

    Box(double l, double w, double h) {
        this.h = h;
        this.l = l;
        this.w = w;
    }

    private void information() {
        System.out.println("Running in box");
    }

    public void area(double l, double w, double h) {
        System.out.print(l * w * h);
    }

}
