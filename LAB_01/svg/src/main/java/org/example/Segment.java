package org.example;

/*
Zadanie 4/L01
Napisz klasę Segment składającą się z dwóch publicznych obiektów Point.
Zdefiniuj w niej metodę length() zwracającą długość odcinka między tymi punktami.
 */

/*
Zadanie 2/L02
Niech klasa Segment posiada dwa prywatne pola Point. Napisz konstruktor który ustawi te pola.
Sprawdź wrażliwość odcinka na zmianę współrzędnych punktów, z których został stworzony.
Wygeneruj metodę toString() zwracającą informację o punkcie.
Zmodyfikuj Segment tak, aby był niewrażliwy na zmianę pozycji punktów, z których został stworzony.
W tym celu napisz w klasie Point konstruktor kopiujący.
 */

public class Segment {
    private Point point_a, point_b;

    public Segment(Point point_a, Point point_b) {
        this.point_a = new Point(point_a); // Użycie konstruktora kopiującego
        this.point_b = new Point(point_b);
    }

    public double length() {
        return Math.sqrt(Math.pow(point_b.getX() - point_a.getX(), 2) + Math.pow(point_b.getY() - point_a.getY(), 2));
    }

    public static Segment getLongestSegment(Segment[] segments){
        Segment longestSegment = segments[0];
        for (Segment segment : segments) {
            if (segment.length() > longestSegment.length()) {
                longestSegment = segment;
            }
        }
        return longestSegment;
    }

    public String toString() {
        return "Segment: " + "Punkt A: " + point_a.toString() + ", Punkt B: " + point_b.toString();
    }


}
