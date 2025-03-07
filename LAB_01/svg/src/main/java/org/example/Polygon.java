package org.example;

/*
Zadanie 3/L02
Zdefiniuj klasę Polygon posiadającą prywatną tablicę obiektów Point.
Napisz publiczny konstruktor który przyjmie taką tablicę i ustawi ją obiekcie Polygon.
Stwórz publiczne metody:
- toString(), która zwróci informacje o punktach wielokątu,
- toSvg(), która zwróci opis wielokąta w postaci odpowiednio sparametryzowanego znacznika <polygon>.
 */

public class Polygon {
    private Point[] points;

    public Polygon(Point[] points) {
        this.points = points;
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
