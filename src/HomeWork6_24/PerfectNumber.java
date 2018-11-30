package HomeWork6_24;

public class PerfectNumber {


    static void isPerfect() {
        double perfectNumber = 1;
        int pow = 2;

        while (perfectNumber < 1000) {
            perfectNumber = ((Math.pow(2, pow) - 1) * Math.pow(2, (pow - 1)));
            pow++;
            System.out.println(perfectNumber);
        }
//        max 8.98846567431158E307
//        while (perfectNumber !=0) {
//            perfectNumber = ((Math.pow(2, pow) - 1) * Math.pow(2, (pow - 1)));
//            pow++;
//            System.out.println(perfectNumber);
//        }


    }


    public static void main(String[] args) {
        isPerfect();
    }
}
