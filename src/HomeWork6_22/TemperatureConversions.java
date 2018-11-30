package HomeWork6_22;

import java.util.Scanner;

public class TemperatureConversions {

    private double celsius;
    private double fahrenheit;

    public TemperatureConversions(double fahrenheit, double celsius) {
        setCelsius(fahrenheit);
        setFahrenheit(celsius);
    }


    private void setCelsius(double fahrenheit) {
        this.celsius = (5.0 / 9.0) * (fahrenheit - 32);
    }

    private void setFahrenheit(double celsius) {
        this.fahrenheit = (9.0 / 5.0) * celsius + 32;
    }

    public double getCelsius() {
        return this.celsius;
    }

    public double getFahrenheit() {
        return this.fahrenheit;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Set Fahrenheit and celsius: ");
        TemperatureConversions temperature = new TemperatureConversions(input.nextDouble(), input.nextDouble());

        System.out.println("Fahrenheit in celsius is: " + temperature.getCelsius()
                + "\nCelsius in fahrenheit is: " + temperature.getFahrenheit());

    }
}
