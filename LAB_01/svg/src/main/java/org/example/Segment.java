package org.example;

/*
Zadanie 4.
Napisz klasę Segment składającą się z dwóch publicznych obiektów Point.
Zdefiniuj w niej metodę length() zwracającą długość odcinka między tymi punktami.
 */

public class Segment {
    public Point point_a, point_b;

    public Segment(Point point_a, Point point_b) {
        this.point_a = point_a;
        this.point_b = point_b;
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


}
