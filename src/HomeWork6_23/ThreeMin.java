package HomeWork6_23;

import java.util.Scanner;

public class ThreeMin {
    public static float minimum3() {
        Scanner input = new Scanner(System.in);
        return Math.min(input.nextFloat(),(Math.min(input.nextFloat(), input.nextFloat())));
    }


    public static void main(String[] args) {
        System.out.println(new ThreeMin().minimum3());
    }
}
