package duck;

public class Cayuga extends Duck {

	public Cayuga(String name) {
		super(name, new BehaviorRealFly());
	}

}