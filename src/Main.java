import duck.*;

public enum Main {
    ;

    public static void main(String[] args) {
//        Race.initializeRaces();
//        IPerson jad = new Person("JAD", Race.ELF, Job.WARRIOR);
//        System.out.println(jad.getValueFromCharacteristic(Characteristic.STAMINA));
//        System.out.println(jad.getValueFromCharacteristic(Characteristic.DEXTERITY));
//
//        System.out.println(jad);
        IDuck bernard = new PlasticDuck("Bernard");
        IDuck donald = new Mallard("Donald");
        IDuck daisy = new Cayuga("Daisy");
        IDuck quentin = new Mallard("Quentin");
        DuckCoop myDuckCoop = new DuckCoop();
        //myDuckCoop.addDuck(new Mallard("Donald"));
        //myDuckCoop.addDuck(new Cayuga("Daisy"));
        myDuckCoop.addDuck(bernard);
        myDuckCoop.addDuck(donald);
        myDuckCoop.addDuck(daisy);
        myDuckCoop.addDuck(quentin);

        myDuckCoop.flyAll();

        //La fée rend visite au canard en plastique
        bernard.setBehaviorFly(new BehaviorRealFly());
        donald.setBehaviorFly(new BehaviorNotFly());
        quentin.setBehaviorFly(() -> "Je vole très très vite !");
        daisy.setBehaviorFly(quentin.getBehaviorFly());

        myDuckCoop.flyAll();
    }
}