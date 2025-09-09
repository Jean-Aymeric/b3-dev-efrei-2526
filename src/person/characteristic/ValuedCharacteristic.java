package person.characteristic;

public class ValuedCharacteristic {

    private final ICharacteristic characteristic;
    private int value;

    public ValuedCharacteristic(final ICharacteristic characteristic, final int value) {
        this.value = value;
        this.characteristic = characteristic;
    }

    public ICharacteristic getCharacteristic() {
        return this.characteristic;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}