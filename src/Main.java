import person.IPerson;
import person.Person;
import person.job.Job;

public enum Main {
    ;

    public static void main(String[] args) {
        IPerson jad = new Person("JAD", null, Job.WARRIOR);
        System.out.println(jad);
    }
}