package duck;

public interface IDuck {

    BehaviorFly getBehaviorFly();

    void setBehaviorFly(BehaviorFly behaviorFly);

    void fly();

    String getName();

}