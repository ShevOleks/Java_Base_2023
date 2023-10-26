package ua.vodafone.lesson10;

public class Point {
    private int abscissa;
    private int ordinate;

    public Point(int abscissa, int ordinate) {
        this.abscissa = abscissa;
        this.ordinate = ordinate;
    }

    public int getAbscissa() {
        return abscissa;
    }

    public void setAbscissa(int abscissa) {
        this.abscissa = abscissa;
    }

    public int getOrdinate() {
        return ordinate;
    }

    public void setOrdinate(int ordinate) {
        this.ordinate = ordinate;
    }

    public static double distanceBetweenPoints (Point first, Point second) {
        int abscissaProjection = first.abscissa - second.abscissa;
        int ordinateProjection = first.ordinate - second.ordinate;
        return Math.sqrt(Math.pow(abscissaProjection,2) + Math.pow(ordinateProjection,2));
    }
    public double distanceToPoint (Point point) {
        return distanceBetweenPoints(this, point);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Point)) {
            return false;
        }
        Point somePoint = (Point) obj;
        return (this.ordinate == somePoint.ordinate && this.abscissa == somePoint.abscissa);
    }

    @Override
    public String toString() {
        return "Coordinates of point are: (" + this.abscissa + " ; " + this.ordinate + ")";
    }
}
