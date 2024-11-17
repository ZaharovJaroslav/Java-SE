
package main.java.point.poitnService;

import main.java.point.model.Point;

public class PointService {
    private Point point;

    public PointService(Point point) {
        this.point = point;
    }

    public Point translate(double x, double y) {
        return new  Point(point.getX() + x,point.getY() + y);

    }

    public Point scale(double ratio) {
        return new Point(point.getX() * ratio,point.getY() * ratio);

    }
}
