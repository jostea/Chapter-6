package HomeWork6_14;

import java.util.Scanner;

public class PowNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int base = input.nextInt();
        int power = input.nextInt();
        double result = 1;

        while (power < 0) {
            System.out.println("Power can be negative!");
            power = input.nextInt();
        }

        for (int i = 0; i < power; i++) {
            result *= base;
        }

        System.out.println(result);
    }
}
