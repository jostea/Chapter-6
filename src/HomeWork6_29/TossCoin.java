package HomeWork6_29;

import java.security.SecureRandom;


public class TossCoin {
    SecureRandom secureRandom = new SecureRandom();

    private enum Coin {HEADS, TAILS}

    public Coin flip() {
        return Coin.values()[secureRandom.nextInt(2)];
    }

    public static void main(String[] args) {
        TossCoin test = new TossCoin();
        int steps = 0;
        int i = 0;
        int heads = 0;
        int tails = 0;

        while (steps < 4) {
            if (test.flip() == Coin.HEADS) {
                heads++;
            } else {
                tails++;
            }
            steps++;
            i++;
        }


        System.out.println("Heads: " + heads);
        System.out.println("Tails: " + tails);
        System.out.println("Coin was tossed: " + i);
    }

}