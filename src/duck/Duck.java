package duck;

public abstract class Duck implements IDuck {

    private String name;

	@Override
	public BehaviorFly getBehaviorFly() {
		return this.behaviorFly;
	}

	@Override
	public void setBehaviorFly(final BehaviorFly behaviorFly) {
		this.behaviorFly = behaviorFly;
	}

	private BehaviorFly behaviorFly;

    public Duck(String name, BehaviorFly behaviorFly) {
        this.name = name;
        this.behaviorFly = behaviorFly;
    }

    public void fly() {
        System.out.println(this.getName() + " : " + this.behaviorFly.fly());
    }

    public String getName() {
        return this.name;
    }

}