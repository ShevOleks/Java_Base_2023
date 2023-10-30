package ua.vodafone.lesson10;

public class PointDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Point one = new Point(1, 1);
        System.out.println("Point One\n" + one);
        Point two = new Point(2, 2);
        System.out.println("Point Two\n" + two);
        Point three = new Point(3, 3);
        System.out.println("Point Three\n" + three);
        Point four = new Point(-1, -1);
        System.out.println("Point Four\n" + four);

        double result = Point.distanceBetweenPoints(one, two);
        System.out.print("\nDistance between two points One and Two is: ");
        printResult(result);
        result = Point.distanceBetweenPoints(one, three);
        System.out.print("\nDistance between two points One and Three is: ");
        printResult(result);
        result = one.distanceToPoint(four);
        System.out.print("\nDistance from point One to Four is: ");
        printResult(result);
        result = three.distanceToPoint(four);
        System.out.print("\nDistance from point Three to Four is: ");
        printResult(result);

        System.out.println("\nCoordinates for point One are (" + one.getAbscissa() + ";" + one.getOrdinate() + ")");
        System.out.printf("Coordinates for point Four are (%d;%d)", four.getAbscissa(), four.getOrdinate());
        System.out.println("\nChange coordinates for point Four to (1;1)");
        four.setAbscissa(1);
        four.setOrdinate(1);
        System.out.printf("Coordinates for point Four are %s\n", four.getCoordinates());
        System.out.println("Compare for points One and Two is: " + one.equals(two));
        System.out.println("Compare for points One and Four is: " + one.equals(four));
        System.out.println("Compare for points One and Four through == is: " + (one == four));
        System.out.println("Compare for points Two (before change) and Three is: " + two.equals(three));
        System.out.println("Change coordinates for point Two to (3;3)");
        two.setCoordinates(3, 3);
        System.out.println("Compare for points Two (after change) and Three is: " + two.equals(three));
        System.out.println("Compare for points Two (after change) and Three through == is: " + (two == three));
        System.out.println("Copy point Four to point Five");
        Point five = new Point(four);
        System.out.println("Compare for points Five and Four is: " + five.equals(four));
        result = Point.distanceBetweenPoints(four, five);
        System.out.print("Distance between two points Four and Five is: ");
        printResult(result);
        System.out.println("\nClone point One to point Six");
        Point six = one.clone();
        System.out.printf("Coordinates for point One are %s\n", one.getCoordinates());
        System.out.printf("Coordinates for point Six are %s\n", six.getCoordinates());
        System.out.println("Change coordinates for point Six to (6;6)");
        six.setCoordinates(6, 6);
        System.out.printf("Coordinates for point One are %s\n", one.getCoordinates());
        System.out.printf("Coordinates for point Six are %s\n", six.getCoordinates());
    }

    private static void printResult(double result) {
        if (result == -1) {
            System.out.print("!!!Compare with NULL!!!");
        } else {
            System.out.printf("%.3f", result);
        }
    }
}
