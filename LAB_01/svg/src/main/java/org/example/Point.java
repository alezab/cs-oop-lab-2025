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

    /*
    Zadanie 2.
    W klasie Point stwórz bezargumentową metodę toSvg(), która zwróci informację o punkcie sformatowaną tak,
    aby można ją było wyświetlić w formacie SVG za pomocą niewielkiego okręgu.
    */
    public String toSvg() {
        return "<circle r=\"5\" cx=\"" + x + "\" cy=\"" + y + "\"/>";
    }

    /*
    Zadanie 3.
    Napisz publiczną metodę translate(), która przyjmie dwie współrzędne dx i dy i
    przesunie o te wartości pozycję punktu.
    Napisz publiczną metodę translated(), która przyjmie dwie współrzędne dx i dy, a następnie utworzy nowy punkt,
    który będzie przesunięty o te wartości w stosunku do pozycji oryginalnego punktu.
     */

    public void translate(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    public Point translated(double dx, double dy) {
        return new Point(x + dx, y + dy);
    }

}
