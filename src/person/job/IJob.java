package person.job;

import dice.Dice;
import person.*;

public interface IJob extends Named {
    Dice getLifePointsByLevel();
}