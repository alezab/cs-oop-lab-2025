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

        Point pointA = new Point(0.0, 0.0);
        Point pointB = new Point(3.0, 4.0);

        Segment testSegment = new Segment(pointA, pointB);
        System.out.println("Odcinek przed zmianą: " + testSegment.toString());

        // Zmiana punktów
        pointA.setX(1.0);
        pointA.setY(1.0);
        pointB.setX(4.0);
        pointB.setY(5.0);
        System.out.println("Odcinek po zmianie: " + testSegment.toString());

        Point[] points = new Point[4];
        points[0] = new Point(0.0, 0.0);
        points[1] = new Point(3.0, 0.0);
        points[2] = new Point(4.0, 0.0);
        points[3] = new Point(5.0, 0.0);
        Polygon polygon = new Polygon(points);


        System.out.println("Polygon przed zmianą:");
        System.out.println(polygon.toString());
        System.out.println(polygon.toSvg());
        System.out.println();
        points[0].setX(1.0);
        points[0].setY(1.0);
        points[1].setX(1.0);
        points[1].setY(1.0);
        points[2].setX(1.0);
        points[2].setY(1.0);
        points[3].setX(1.0);
        points[3].setY(1.0);
        System.out.println("Polygon po zmianie:");
        System.out.println(polygon.toString());
        System.out.println(polygon.toSvg());

        //Polygon copyPolygon = new Polygon(polygon);
        //System.out.println(copyPolygon.toString());

        SvgScene svgScene = new SvgScene();
        svgScene.addPolygon(polygon);
        svgScene.addPolygon(polygon);
        svgScene.addPolygon(polygon);

        System.out.println(svgScene.getPolygons()[0]);


    }

}