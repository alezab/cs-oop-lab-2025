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

        //System.out.println(Segment.length(point, point2));

        Segment[] segments = new Segment[3];
        segments[0] = new Segment(new Point(0.0, 0.0), new Point(3.0, 4.0));
        segments[1] = new Segment(new Point(1.0, 1.0), new Point(7.0, 1.0));
        segments[2] = new Segment(new Point(-2.0, -3.0), new Point(2.0, 0.0));

        //Segment longestSegment = getLongestSegment(segments);
        //System.out.println(Segment.length(longestSegment.point_a, longestSegment.point_b));

        Segment longestSegment = Segment.getLongestSegment(segments);
        System.out.println(longestSegment.length());
    }

    /*
    Zadanie 5.
    W klasie Main napisz metodę statyczną, która przyjmie tablicę obiektów Segment i zwróci najdłuższy segment.
    Następnie przenieś tę metodę do klasy Segment.
    */
/*
    public static Segment getLongestSegment(Segment[] segments){
        Segment longestSegment = segments[0];
        for (Segment segment : segments) {
            if (Segment.length(segment.point_a, segment.point_b) > Segment.length(longestSegment.point_a, longestSegment.point_b)) {
                longestSegment = segment;
            }
        }
        return longestSegment;
    }

 */
}