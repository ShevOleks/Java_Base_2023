package ua.vodafone.lesson2;

public class ParallelepipedVolumeLength {
    public static void main(String[] args) {
        double width = 3.5;
        double height = 4.2;
        double depth = 5;
        double volume = width * height * depth;
        System.out.println("Parallelepiped volume = " + volume);
        double length = 4 * (width + height + depth);
        System.out.println("Summary length of all sides = " + length);
    }
}
