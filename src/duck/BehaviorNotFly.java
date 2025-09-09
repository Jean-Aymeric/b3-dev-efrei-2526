package duck;

public class BehaviorNotFly implements BehaviorFly {
    @Override
    public String fly() {
        return "Je ne vole pas ...";
    }
}
