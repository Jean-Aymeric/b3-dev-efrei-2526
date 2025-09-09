package person.race;

import person.characteristic.Characteristic;
import person.characteristic.ValuedCharacteristic;

import java.util.ArrayList;
import java.util.List;

public enum Race implements IRace {
    DWARF("Nain"),
    ELF("Elfe"),
    ORC("Orque"),
    HUMAN("Humain");;

    private String name;
    private List<ValuedCharacteristic> characteristicModifiers;

    Race(String name) {
        this.characteristicModifiers = new ArrayList();
    }

    public static void initializeRaces() {
        Race.DWARF.characteristicModifiers.add(new ValuedCharacteristic(Characteristic.STAMINA, 1));
        Race.DWARF.characteristicModifiers.add(new ValuedCharacteristic(Characteristic.INTELLIGENCE, -1));

        Race.ELF.characteristicModifiers.add(new ValuedCharacteristic(Characteristic.STAMINA, -1));
        Race.ELF.characteristicModifiers.add(new ValuedCharacteristic(Characteristic.DEXTERITY, 1));

        Race.ORC.characteristicModifiers.add(new ValuedCharacteristic(Characteristic.STAMINA, 2));
        Race.ORC.characteristicModifiers.add(new ValuedCharacteristic(Characteristic.STRENGTH, 1));
        Race.ORC.characteristicModifiers.add(new ValuedCharacteristic(Characteristic.INTELLIGENCE, -3));
    }

    public String getName() {
        return this.name;
    }
}