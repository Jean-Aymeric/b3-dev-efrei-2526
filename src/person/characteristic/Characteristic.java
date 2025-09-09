package person.characteristic;

public enum Characteristic implements ICharacteristic {
    STRENGTH("Force"),
    DEXTERITY("Dextérité"),
    STAMINA("Endurance"),
    WISDOM("Sagesse"),
    INTELLIGENCE("Intelligence"),
    LIFE_POINTS("Points de vie");

    private String name;

    Characteristic(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

}