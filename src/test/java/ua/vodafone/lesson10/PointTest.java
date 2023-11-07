package ua.vodafone.lesson10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PointTest {
    //given
    private final Point one = new Point(1, 1);
    private final Point two = new Point(2, 2);

    @Test
    void distanceBetweenNormalPoints() {
        //when
        double result = Point.distanceBetweenPoints(one, two);
        //then
        Assertions.assertEquals(Math.sqrt(2), result);
    }

    @Test
    void distanceBetweenSamePoint() {
        //when
        double result = Point.distanceBetweenPoints(two, two);
        //then
        Assertions.assertEquals(0, result);
    }

    @Test
    void distanceBetweenNullAndNormalPoints() {
        //when
        double result = Point.distanceBetweenPoints(null, two);
        //then
        Assertions.assertEquals(-1, result);
    }

    @Test
    void distanceBetweenNormalAndNullPoints() {
        //when
        double result = Point.distanceBetweenPoints(one, null);
        //then
        Assertions.assertEquals(-1, result);
    }

    @Test
    void distanceBetweenNullPoints() {
        //when
        double result = Point.distanceBetweenPoints(null, null);
        //then
        Assertions.assertEquals(-1, result);
    }

    @Test
    void distanceToNormalPoint() {
        //when
        double result = one.distanceToPoint(two);
        //then
        Assertions.assertEquals(Math.sqrt(2), result);
    }

    @Test
    void distanceToSamePoint() {
        //when
        double result = one.distanceToPoint(one);
        //then
        Assertions.assertEquals(0, result);
    }

    @Test
    void distanceToNullPoint() {
        //when
        double result = one.distanceToPoint(null);
        //then
        Assertions.assertEquals(-1, result);
    }
}