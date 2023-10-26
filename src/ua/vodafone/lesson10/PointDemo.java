package ua.vodafone.lesson10;

public class PointDemo {
    public static void main(String[] args) {
        Point one = new Point(1,1);
        System.out.println("Point One\n" + one);
        Point two = new Point(2,2);
        System.out.println("Point Two\n" + two);
        Point three = new Point(3,3);
        System.out.println("Point Three\n" + three);
        Point four = new Point(-1,-1);
        System.out.println("Point Four\n" + four);

        System.out.printf("\nDistance between two points One and Two is: %.3f", Point.distanceBetweenPoints(one,two));
        System.out.printf("\nDistance between two points One and Three is: %.3f", Point.distanceBetweenPoints(one,three));
        System.out.printf("\nDistance from point One to Four is: %.3f", one.distanceToPoint(four));
        System.out.printf("\nDistance from point Three to Four is: %.3f", three.distanceToPoint(four));

        System.out.println("\nCoordinate for point One are (" + one.getAbscissa() + ";" + one.getOrdinate() + ")");
        System.out.printf("Coordinate for point Four are (%d;%d)", four.getAbscissa(), four.getOrdinate());
        System.out.println("\nChange coordinates for point Four to (1;1)");
        four.setAbscissa(1);
        four.setOrdinate(1);
        System.out.printf("Coordinate for point Four are (%d;%d)\n", four.getAbscissa(), four.getOrdinate());
        System.out.println("Compare for points One and Two is: " + one.equals(two));
        System.out.println("Compare for points One and Four is: " + one.equals(four));
    }
}
