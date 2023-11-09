package ua.vodafone.lesson13;

public class MatrixOperations {
    public static Double averageOfArray(Integer[][] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        double sumOfArray = 0;
        int elementsNumber = 0;
        for (Integer[] line : array) {
            if (line == null) {
                continue;
            }
            for (Integer cell : line) {
                if (cell == null) {
                    continue;
                }
                sumOfArray += cell;
                elementsNumber++;
            }
        }
        if (elementsNumber == 0) {
            return null;
        }
        return sumOfArray / elementsNumber;
    }

    public static boolean checkForSquareMatrix(Integer[][] array) {
        if (array == null || array.length == 0) {
            return false;
        }
        for (Integer[] line : array) {
            if (line == null || line.length != array.length) {
                return false;
            }
        }
        return true;
    }
}
