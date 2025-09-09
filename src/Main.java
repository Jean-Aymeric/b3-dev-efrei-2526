import dice.Dice;
import dice.IDice;

import java.util.ArrayList;
import java.util.List;

public enum Main {
    ;

    public static void main(String[] args) {
        List<IDice> dices = new ArrayList<>();
        dices.add(Dice.D20);
        dices.add(Dice.D4);
        dices.add(Dice.D6);
        dices.add(Dice.Coin);

        for (IDice dice : dices) {
            System.out.println("D" + dice.getNbSides() + " : " + dice.roll());
            System.out.println("4xD" + dice.getNbSides() + " : " + dice.roll(4));
        }
    }
}