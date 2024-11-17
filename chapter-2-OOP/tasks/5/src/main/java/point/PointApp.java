package main.java.point;

import main.java.point.model.Point;

import java.util.Scanner;

public class PointApp {

    public static void main(String[] args) {
        Point p = new Point(3, 4).translate(1, 3).scale(0.5);
        System.out.printf("%s;%s", p.getX(), p.getY());
        }
    }

