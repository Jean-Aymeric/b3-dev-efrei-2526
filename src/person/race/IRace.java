package person.race;

import person.*;
import person.characteristic.Characteristic;

public interface IRace extends Named {
    int getModifierFromCharacteristic(Characteristic characteristic);
}