package org.example;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(2.0, 3.0);

        System.out.println(point.toString());
        System.out.println(point.toSvg());

        point.translate(2.0, 5.0);
        System.out.println(point.toSvg());

        Point point2 = point.translated(2.0, 5.0);
        System.out.println(point2.toSvg());
    }
}