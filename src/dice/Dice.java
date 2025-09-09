package dice;

import java.util.Random;

public enum Dice implements IDice {
    Coin(2),
    D4(4),
    D6(6),
    D8(8),
    D10(10),
    D20(20);

    private static final Random random = new Random();
    private final int nbSides;

    Dice(int nbSides) {
        this.nbSides = nbSides;
    }

    private static int getRandIntBetween1And(int bound) {
        return Dice.random.nextInt(0, bound) + 1;
    }

    public int roll() {
        return Dice.getRandIntBetween1And(this.getNbSides());
    }

    public int roll(int nbRolls) {
        int result = 0;
        for (int i = 0; i < nbRolls; i++) {
            result += this.roll();
        }
        return result;
    }

    public int getNbSides() {
        return this.nbSides;
    }
}