package person;

import dice.Dice;
import person.characteristic.Characteristic;
import person.characteristic.ICharacteristic;
import person.characteristic.ValuedCharacteristic;
import person.job.IJob;
import person.race.IRace;

import java.util.ArrayList;

public class Person implements IPerson, Named {

    private IRace race;
    private String name;
    private IJob job;
    private ArrayList<ValuedCharacteristic> valuedCharacteristics;

    public Person(final String name, final IRace race, final IJob job) {
        this.race = race;
        this.name = name;
        this.job = job;
		this.valuedCharacteristics = new ArrayList<>();
		for(ICharacteristic characteristic : Characteristic.values()) {
			this.valuedCharacteristics.add(new ValuedCharacteristic(characteristic, Dice.D6.roll(3)));
		}
    }

    public IRace getRace() {
        return this.race;
    }

    public IJob getJob() {
        return this.job;
    }

    public void setJob(IJob job) {
        this.job = job;
    }

    public String getName() {
        return this.name;
    }

    public int getValueFromCharacteristic(Characteristic characteristic) {
        // TODO - implement Person.getValueFromCharacteristic
        throw new UnsupportedOperationException();
    }

}