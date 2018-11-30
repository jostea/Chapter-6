package HomeWork6_26;

import java.util.Scanner;

public class ReversingDigits {
    private int number;

    public ReversingDigits() {
        Scanner input = new Scanner(System.in);
        setNumber(reversDigits(input.nextInt()));
    }

    public int reversDigits(int num) {
        int temp = 0;
        while (num != 0) {
            temp = temp * 10;
            temp = temp + num % 10;
            num = num / 10;
        }
        return temp;
    }


    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public static void main(String[] args) {
        System.out.print("Set number: ");
        System.out.println(new ReversingDigits().getNumber());
    }
}
