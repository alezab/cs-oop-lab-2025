package org.example;

/*
Zadanie 3/L02
Zdefiniuj klasę Polygon posiadającą prywatną tablicę obiektów Point.
Napisz publiczny konstruktor który przyjmie taką tablicę i ustawi ją obiekcie Polygon.
Stwórz publiczne metody:
- toString(), która zwróci informacje o punktach wielokątu,
- toSvg(), która zwróci opis wielokąta w postaci odpowiednio sparametryzowanego znacznika <polygon>.
 */

/*
Zadanie 4/L02
Zmodyfikuj konstruktor klasy Polygon tak, aby ustawiał w polu obiektu kopię tablicy przekazanej jako argument.
Następnie zmodyfikuj go tak, aby tworzył nową tablicę zapełnioną kopiami obiektów Point z oryginalnej tablicy.
W klasie Polygon napisz konstruktor kopiujący, który wykonuje płytką kopię obiektu.
Następnie zmodyfikuj go tak, aby wykonywał głęboką kopię.
*/


public class Polygon {
    private Point[] points;

    public Polygon(Point[] points) {
        this.points = new Point[points.length];
        for (int i = 0; i < points.length; i++) {
            this.points[i] = new Point(points[i]);
        }
    }

    // Płytka kopia
    /*
    public Polygon(Polygon polygon) {
        this.points = polygon.points;
    }
    */

    // Głęboka kopia
    public Polygon(Polygon polygon) {
        this.points = new Point[polygon.points.length];
        for (int i = 0; i < polygon.points.length; i++) {
            this.points[i] = new Point(polygon.points[i]);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Polygon:\n");
        for (Point point : points) {
            sb.append(point).append("\n");
        }
        return sb.toString();
    }

    // <polygon points="100,10 150,190 50,190" style="fill:lime;stroke:purple;stroke-width:3" />
    public String toSvg() {
        StringBuilder sb = new StringBuilder();
        sb.append("<polygon points=\"");
        for (Point point : points) {
            sb.append(point.getX()).append(",").append(point.getY()).append(" ");
        }
        sb.append("\"/>");
        return sb.toString();
    }

}
