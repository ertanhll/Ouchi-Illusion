/*
    Aufgabe 1) Verschachtelte Schleifen - Optische Täuschung Ouchi Illusion
*/

import java.awt.*;

public class Aufgabe1 {

    public static void main(final String[] args) {

        int width = 512, height = 512;
        StdDraw.setCanvasSize(width, height);
        StdDraw.setXscale(0, width);
        StdDraw.setYscale(0, height);
        StdDraw.setPenRadius(0.001);
        StdDraw.setPenColor(Color.black);

        int xStart = 8, yStart = 6, yDistanz = 8, xDistanz = 32; // Abmessung  der einzelnen schwarzen Rechhtecken ist 16*4.


        for (int y = yStart; y < height; y += yDistanz) {     //Die schwarzen Ecken in der Y Richtung
            for (int x = xStart; x < width; x += xDistanz) {  // Die schwarzen Ecken in der X Richtung


                if ((x > 64 && y > 64) && (x < 192 && y < 192)) {               // Unten links der Mittelpunkt des ersten Quadrats (unten links) 128*128
                    StdDraw.filledRectangle(y, x, 2, 8);
                    StdDraw.filledRectangle(y - 4, x + 16, 2, 8);
                } else if ((x > 320 && y > 64) && (x < 448 && y < 192)) {       // Unten rechts der Mittelpunkt des ersten Quadrats (unten rechts) 384*128
                    StdDraw.filledRectangle(y, x, 2, 8);
                    StdDraw.filledRectangle(y - 4, x + 16, 2, 8);
                } else if ((x > 64 && y > 320) && (x < 192 && y < 448)) {       // Oben links der Mittelpunkt des ersten Quadrats (oben links) 128*384
                    StdDraw.filledRectangle(y, x, 2, 8);
                    StdDraw.filledRectangle(y - 4, x + 16, 2, 8);
                } else if ((x > 320 && y > 320) && (x < 448 && y < 448)) {      // Oben rechts der Mittelpunkt des ersten Quadrats (oben rechts) 384*384
                    StdDraw.filledRectangle(y, x, 2, 8);
                    StdDraw.filledRectangle(y - 4, x + 16, 2, 8);
                } else {
                    StdDraw.filledRectangle(x, y, 8, 2);    //Auuser die vier inneren Quadrate
                    StdDraw.filledRectangle(x + 16, y - 4, 8, 2);
                }
            }
        }
    }
}


//Zusatzfragen
//1. Ich habe in diesem Beispiel bereits mit for-Schleife implemetiert.
// Es ist möglich mit while-Schleife und auch mit for-Schleife.
// Bei einer for-Schleife kann der Laufindexwert als Koordinate verwendet werden,
// zudem ist die Endbedingung eindeutig. Bei einer while-Schleife müsste dies mit eigenen Variablen
// und Verzweigungen realisiert werden.
