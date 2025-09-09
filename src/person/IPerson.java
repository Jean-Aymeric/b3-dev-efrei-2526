package person;

import person.characteristic.*;

public interface IPerson {

	/**
	 * 
	 * @param characteristic
	 */
	int getValueFromCharacteristic(Characteristic characteristic);
}