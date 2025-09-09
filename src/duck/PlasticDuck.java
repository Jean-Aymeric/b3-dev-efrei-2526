package duck;

public class PlasticDuck extends Duck {

    public PlasticDuck(String name) {
        super(name, new BehaviorNotFly());
    }


}