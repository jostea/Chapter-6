package HomeWork6_20;

import java.util.Scanner;

public class CircleArea {
    private double radius;
    private double square;

    public CircleArea() {
        Scanner input = new Scanner(System.in);
        setRadius(input.nextDouble());
        setSquare(circleArea(getRadius()));
    }


    private static double circleArea(double radius) {
        return Math.PI * (Math.pow(radius, 2));
    }


    private void setRadius(double radius) {
        Scanner input = new Scanner(System.in);
        while (radius <= 0) {
            System.out.println("Set radius again.");
            radius = input.nextDouble();
        }
        this.radius = radius;
    }

    private void setSquare(double square) {
        this.square = square;
    }

    public double getRadius() {
        return radius;
    }

    public double getSquare() {
        return square;
    }

}
