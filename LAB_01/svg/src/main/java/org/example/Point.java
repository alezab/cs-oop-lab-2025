package org.example;

/*
Zadanie 1.
Zdefiniuj klasę Point posiadającą dwa publiczne, zmiennoprzecinkowe pola - współrzędne x i y.
Ustaw i wyświetl te pola.
Stwórz bezargumentową metodę toString(), która zwraca informację o współrzędnych punktu za pomocą napisu.
 */

public class Point {
    public double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "Point_x: " + x + ", Point_y: " + y;
    }
}
