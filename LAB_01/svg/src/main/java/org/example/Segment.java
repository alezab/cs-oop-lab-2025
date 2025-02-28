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

    public static double length(Point point_a, Point point_b) {
        return Math.sqrt(Math.pow(point_b.x - point_a.x, 2) + Math.pow(point_b.y - point_a.y, 2));
    }

    public static Segment getLongestSegment(Segment[] segments){
        Segment longestSegment = segments[0];
        for (Segment segment : segments) {
            if (Segment.length(segment.point_a, segment.point_b) > Segment.length(longestSegment.point_a, longestSegment.point_b)) {
                longestSegment = segment;
            }
        }
        return longestSegment;
    }


}
