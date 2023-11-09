package ua.vodafone.lesson13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MatrixOperationsTest {
    private static final double DELTA = 0.001;

    //==================== Tests for averageOfArray =====================
    @Test
    void averageOfNullArray() {
        Assertions.assertNull(MatrixOperations.averageOfArray(null));
    }

    @Test
    void averageOfEmptyArray() {
        Assertions.assertNull(MatrixOperations.averageOfArray(new Integer[][]{}));
    }

    @Test
    void averageOfEmptyRowsArray() {
        Assertions.assertNull(MatrixOperations.averageOfArray(new Integer[][]{{}, {}, {}}));
    }

    @Test
    void averageOfArrayOneNullRow() {
        //when
        Double result = MatrixOperations.averageOfArray(new Integer[][]{{1, 1, 1}, {2, 2, 2}, null, {3, 3, 3}});
        //then
        Assertions.assertEquals(2, result, DELTA);
    }

    @Test
    void averageOfArrayOneEmptyRow() {
        //when
        Double result = MatrixOperations.averageOfArray(new Integer[][]{{1, 1, 1}, {2, 2, 2}, {}, {3, 3, 3}});
        //then
        Assertions.assertEquals(2, result, DELTA);
    }

    @Test
    void averageOfLineArray() {
        //when
        Double result = MatrixOperations.averageOfArray(new Integer[][]{{1, 2, 3}});
        //then
        Assertions.assertEquals(2, result, DELTA);
    }

    @Test
    void averageOfArrayOneNormalRow() {
        //when
        Double result = MatrixOperations.averageOfArray(new Integer[][]{{}, {2, 2}, {}, {3, null, 3}, null});
        //then
        Assertions.assertEquals(2.5, result, DELTA);
    }

    @Test
    void averageOfNormalArray() {
        //when
        Double result = MatrixOperations.averageOfArray(new Integer[][]{{1}, {2, 2}, {3, 3, 3}, {4, 4, 4, 4}});
        //then
        Assertions.assertEquals(3, result, DELTA);
    }
    //=========================================================================

    //==================== Tests for checkForSquareMatrix =====================
    @Test
    void checkFalseForNullMatrix() {
        Assertions.assertFalse(MatrixOperations.checkForSquareMatrix(null));
    }

    @Test
    void checkFalseForEmptyMatrix() {
        Assertions.assertFalse(MatrixOperations.checkForSquareMatrix(new Integer[][]{}));
    }

    @Test
    void checkFalseForEmptyRowsMatrix() {
        Assertions.assertFalse(MatrixOperations.checkForSquareMatrix(new Integer[][]{{}, {}, {}}));
    }

    @Test
    void checkFalseForOneNullRowMatrix() {
        Assertions.assertFalse(MatrixOperations.checkForSquareMatrix(new Integer[][]{{1, 1, 1}, {2, 2, 2}, null, {3, 3, 3}}));
    }

    @Test
    void checkFalseForOneEmptyRowMatrix() {
        Assertions.assertFalse(MatrixOperations.checkForSquareMatrix(new Integer[][]{{1, 1, 1}, {2, 2, 2}, {}, {3, 3, 3}}));
    }

    @Test
    void checkFalseForLineMatrix() {
        Assertions.assertFalse(MatrixOperations.checkForSquareMatrix(new Integer[][]{{1, 2, 3}}));
    }

    @Test
    void checkFalseForMixedMatrix() {
        Assertions.assertFalse(MatrixOperations.checkForSquareMatrix(new Integer[][]{{}, {2, 2}, {}, {3, null, 3}, null}));
    }

    @Test
    void checkTrueForOneCellMatrix() {
        Assertions.assertTrue(MatrixOperations.checkForSquareMatrix(new Integer[][]{{1}}));
    }

    @Test
    void checkTrueForSquareMatrix() {
        Assertions.assertTrue(MatrixOperations.checkForSquareMatrix(new Integer[][]{{1, 1, 1}, {2, 2, 2}, {3, 3, 3}}));
    }

    @Test
    void checkTrueForTrickyMatrix() {
        Assertions.assertTrue(MatrixOperations.checkForSquareMatrix(new Integer[][]{{null, 1, 1}, {2, null, 2}, {3, 3, null}}));
    }

    @Test
    void checkFalseForTricky2Matrix() {
        Assertions.assertFalse(MatrixOperations.checkForSquareMatrix(new Integer[][]{{1, null, 1}, null, {3, null, 3}}));
    }

}