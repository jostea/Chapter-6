package HomeWork6_16;

import java.util.Scanner;

public class Multiples {

    private static String isMultiple(int a, int b) {
        return (b % a == 0) ? b + " multiple " + a : "Not multiple";
    }

    static void callMethod() {
        Scanner input = new Scanner(System.in);
        int stop = 1;
        while (stop != 0) {
            System.out.print("Set numbers to check multiples ");
            System.out.println(isMultiple(input.nextInt(), input.nextInt()));
            System.out.print("Enter 0 to stop or set something else number to continue:");
            stop = input.nextInt();
        }
    }

    public static void main(String[] args) {
        callMethod();
    }
}
