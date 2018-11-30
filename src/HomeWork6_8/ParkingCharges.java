package HomeWork6_8;

import java.util.Scanner;

public class ParkingCharges {

    private double hours;
    private double charges;

    public ParkingCharges() {
        Scanner input = new Scanner(System.in);
        setHours(input.nextDouble());

    }

//    public double validationHours() {
//        Scanner input = new Scanner(System.in);
//        while (hours <= 0) {
//            hours = input.nextDouble();
//        }
//        return hours;
//    }

    public static void calculateCharges(ParkingCharges[] customer) {

        for (int i = 0; i < customer.length; i++) {
            System.out.println("Hours of costumer " + i + " : " + customer[i].getHours());
            if (customer[i].getHours() <= 3 && customer[i].getHours() > 0) {
                customer[i].setCharges(2);
            }

            if (customer[i].getHours() > 3 && customer[i].getHours() < 24.0) {
                customer[i].setCharges(((customer[i].getHours() - 3) * 0.5) + 2);
            }

            if (customer[i].getHours() >= 24) {
                customer[i].setCharges((Math.floor(customer[i].getHours() / 24) * 10) +
                        ((customer[i].getHours() % 24) * 0.5));
            }

        }
    }


    public void setHours(double hours) {
        Scanner input = new Scanner(System.in);
        while (hours <= 0) {
            hours = input.nextDouble();
        }
        this.hours = hours;

    }

    public double getHours() {
        return hours;
    }

    public void setCharges(double charges) {
        this.charges = charges;
    }

    public double getCharges() {
        return charges;
    }


    public static void main(String[] args) {

        ParkingCharges[] customer = new ParkingCharges[3];

        for (int i = 0; i < customer.length; i++) {
            System.out.print("Enter hours for " + (i + 1) + " customer:");
            customer[i] = new ParkingCharges();
        }
        calculateCharges(customer);

        for (int i = 0; i < customer.length; i++) {
            System.out.println("Charges for " + (i + 1) + " customer is :" + customer[i].getCharges());
        }


    }


}
