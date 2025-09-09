package duck;

import java.util.ArrayList;
import java.util.List;

public class DuckCoop {

    private final List<IDuck> ducks = new ArrayList<>();

    public DuckCoop() {

    }

    public void flyAll() {
        for (IDuck duck : this.ducks) {
            duck.fly();
        }
    }

    public void addDuck(IDuck duck) {
        this.ducks.add(duck);
    }

}