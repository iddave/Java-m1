package com.Laliev.javacore.chapter08;

class Box {
    double width;
    double height;
    double depth;

    Box(Box3 ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}

class BoxWeight extends Box3 {
    double weight;

    BoxWeight(double w, double h, double d, double m) {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
}

public class DemoBoxWeight {
    public static void main(String args[]) {
        BoxWeight3 mybox1 = new BoxWeight3(10, 20, 15, 34.3);
        BoxWeight3 mybox2 = new BoxWeight3(2, 3, 4, 0.076);
        double vol;

        vol = mybox1.volume();
        System.out.println("Объем mybox1 = " + vol);
        System.out.println("Вес mybox1 = " + mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Объем mybox2 = " + vol);
        System.out.println("Вес mybox2 = " + mybox2.weight);
    }
}