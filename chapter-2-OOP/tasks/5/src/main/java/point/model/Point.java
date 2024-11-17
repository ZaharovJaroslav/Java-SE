package main.java.point.model;

public class Point {
    private  double x;
    private double y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;

    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public Point translate(double x, double y) {
        return new Point(getX() + x,getY() + y);
    }

    public Point scale(double ratio) {
        return new Point(getX() * ratio,getY() * ratio);
    }
}
