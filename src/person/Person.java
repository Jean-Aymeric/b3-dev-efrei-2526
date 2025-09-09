package person;

import dice.Dice;
import person.characteristic.Characteristic;
import person.characteristic.ICharacteristic;
import person.characteristic.ValuedCharacteristic;
import person.job.IJob;
import person.race.IRace;

import java.util.ArrayList;

public class Person implements IPerson, Named {

    private final ArrayList<ValuedCharacteristic> valuedCharacteristics;
    private IRace race;
    private String name;
    private IJob job;

    public Person(final String name, final IRace race, final IJob job) {
        this.race = race;
        this.name = name;
        this.job = job;
        this.valuedCharacteristics = new ArrayList<>();
        for (ICharacteristic characteristic : Characteristic.values()) {
            this.valuedCharacteristics.add(new ValuedCharacteristic(characteristic, Dice.D6.roll(3)));
        }
        this.setValueForCharacteristic(Characteristic.LIFE_POINTS, this.getJob().getLifePointsByLevel().getNbSides());
    }

    public void setValueForCharacteristic(Characteristic characteristic, int value) {
        ValuedCharacteristic result = null;
        result = this.getValuedCharacteristicFromCharacteristic(characteristic);
        if (result == null) {
            result = new ValuedCharacteristic(characteristic, 0);
            this.valuedCharacteristics.add(result);
        }
        result.setValue(value);
    }

    public IJob getJob() {
        return this.job;
    }

    private ValuedCharacteristic getValuedCharacteristicFromCharacteristic(final Characteristic characteristic) {
        ValuedCharacteristic result = null;
        for (ValuedCharacteristic valuedCharacteristic : this.valuedCharacteristics) {
            if (valuedCharacteristic.getCharacteristic() == characteristic) {
                result = valuedCharacteristic;
            }
        }
        return result;
    }

    public void setJob(IJob job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "valuedCharacteristics=" + this.valuedCharacteristics +
                ", race=" + this.getRace() +
                ", name='" + this.getName() + '\'' +
                ", job=" + this.getJob() +
                '}';
    }

    public IRace getRace() {
        return this.race;
    }

    public String getName() {
        return this.name;
    }

    public int getValueFromCharacteristic(Characteristic characteristic) {
        ValuedCharacteristic result = this.getValuedCharacteristicFromCharacteristic(characteristic);
        for (ValuedCharacteristic valuedCharacteristic : this.valuedCharacteristics) {
            if (valuedCharacteristic.getCharacteristic() == characteristic) return valuedCharacteristic.getValue();
        }
        return ((result == null) ? 0 : result.getValue()) + this.race.getModifierFromCharacteristic(characteristic);
    }
}