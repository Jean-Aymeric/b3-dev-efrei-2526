import person.IPerson;
import person.Person;
import person.characteristic.Characteristic;
import person.job.Job;
import person.race.Race;

public enum Main {
    ;

    public static void main(String[] args) {
        Race.initializeRaces();
        IPerson jad = new Person("JAD", Race.ELF, Job.WARRIOR);
        System.out.println(jad.getValueFromCharacteristic(Characteristic.STAMINA));
        System.out.println(jad.getValueFromCharacteristic(Characteristic.DEXTERITY));

        System.out.println(jad);
    }
}