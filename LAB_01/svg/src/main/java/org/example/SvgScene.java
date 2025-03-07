package org.example;

/*
Zadanie 5/L02
Zdefiniuj klasę SvgScene. Klasa powinna posiadać prywatną tablicę 3 referencji do obiektów Polygon.
Napisz funkcję addPolygon(), która doda przekazaną referencję na obiekt Polygon do tablicy.
Jeżeli miejsce się wyczerpie, powinna zacząć nadpisywać wielokąty od początku.
 */

public class SvgScene {
    private Polygon[] polygons;
    private int index;

    public SvgScene() {
        this.polygons = new Polygon[3];
        this.index = 0;
    }

    public void addPolygon(Polygon polygon) {
        for (int i=0; i<this.polygons.length; i++){
            if (this.polygons[i] == null){
                this.polygons[i] = polygon;
                return;
            }
        }

        if (this.index == polygons.length) {
            this.index = 0;
        }
        this.polygons[this.index] = polygon;
        this.index++;
    }

    public Polygon[] getPolygons() {
        return polygons;
    }

    /*
    Zadanie 6.
    W klasie SvgScene napisz metodę toSvg(), która zwróci napis utworzony
    z napisów zwracanych przez toSvg() wszystkich wielokątów z tablicy.
     */
    public String toSvg() {
        StringBuilder svg = new StringBuilder();
        svg.append("<svg>\n");
        for (Polygon polygon : polygons) {
            if (polygon == null) continue;
            svg.append(polygon.toSvg()).append("\n");
        }
        svg.append("</svg>");
        return svg.toString();
    }

    public BoundingBox boundingBox() {
        double minX = Double.MAX_VALUE, minY = Double.MAX_VALUE;
        double maxX = -Double.MAX_VALUE, maxY = -Double.MAX_VALUE;
        for (Polygon polygon : polygons) {
            if (polygon == null) continue;
            for (Point point : polygon.getPoints()) {
                minX = Math.min(minX, point.getX());
                minY = Math.min(minY, point.getY());
                maxX = Math.max(maxX, point.getX());
                maxY = Math.max(maxY, point.getY());
            }
        }
        return new BoundingBox(minX, minY, maxX - minX, maxY - minY);
    }


}
