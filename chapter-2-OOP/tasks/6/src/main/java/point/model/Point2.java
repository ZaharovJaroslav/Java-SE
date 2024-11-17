package main.java.point.model;

public class Point2 {
    private double x;
    private double y;

    public Point2() {
        this.x = 0;
        this.y = 0;
    }

    public Point2(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public Point2 translate(double xd, double yd) {
        x += xd;
        y += xd;
        return this;
    }

    public Point2 scale(double ratio) {
        x *= ratio;
        y *= ratio;
        return this;
    }

}
