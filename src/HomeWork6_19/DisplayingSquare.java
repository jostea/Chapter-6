package HomeWork6_19;

import java.util.Scanner;

public class DisplayingSquare {
    Scanner input = new Scanner(System.in);

    private int size;
    private char fillCharacter;

    public DisplayingSquare(char fillCharacter, int size) {
        setFillCharacter(fillCharacter);
        setSize(size);

    }

    public void displayForm() {
        for (int i = 0; i < size; i++) {
            System.out.println();
            for (int j = 0; j < size; j++) {
                System.out.print(fillCharacter + "  ");
            }
        }

    }


    public void setSize(int size) {

        while (size < 0) {
            size = input.nextInt();
        }
        this.size = size;
    }


    public void setFillCharacter(char fillCharacter) {
//        while (fillCharacter != '#' && fillCharacter != '*') {
//            System.out.print("Enter # or *");
//            fillCharacter = input.next().charAt(0);}

        this.fillCharacter = fillCharacter;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Set Character");

        new DisplayingSquare(in.next().charAt(0), in.nextInt()).displayForm();


    }
}
