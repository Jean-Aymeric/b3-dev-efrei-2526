package duck;

public class Mallard extends Duck {

    public Mallard(String name) {
        super(name, new BehaviorRealFly());
    }
}