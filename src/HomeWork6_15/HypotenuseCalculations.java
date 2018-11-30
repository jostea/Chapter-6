package HomeWork6_15;

import java.util.Random;
import java.util.Scanner;

public class HypotenuseCalculations {
    private double a;
    private double b;
    private double hypotenuse;


    public HypotenuseCalculations(double a, double b) {
        setA(a);
        setB(b);
        setHypotenuse(getA(), getB());
    }


    private double setHypotenuse(double a, double b) {
        return hypotenuse = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    private void setA(double a) {
        this.a = a;
    }

    private void setB(double b) {
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getHypotenuse() {
        return hypotenuse;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        HypotenuseCalculations[] side = new HypotenuseCalculations[3];

        for (int i = 0; i < side.length; i++) {
            side[i] = new HypotenuseCalculations(input.nextDouble(), input.nextDouble());
        }

        System.out.println("size 1\t\t\t" + "size 2\t\t\t" + "Hypotenuse");
        for (int i = 0; i < side.length; i++) {
            System.out.printf("%.2f \t\t\t%.2f \t\t\t %.2f\n", (side[i].getA()),
                    (side[i].getB()), side[i].getHypotenuse());
        }

    }

}
