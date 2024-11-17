package main.java.point;

import main.java.point.model.Point2;

public class PointApp2 {
    public static void main(String[] args) {
        Point2 point = new Point2(3, 4).translate(1,3).scale(0.5);
        System.out.printf("%s;%s", point.getX(), point.getY());
        }
    }

