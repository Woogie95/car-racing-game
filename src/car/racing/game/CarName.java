package car.racing.game;

import java.util.List;

public class CarName {

    private static final String SYMBOL = ",";

    public List<String> divideCarName(String name) {
        return List.of((name.split(SYMBOL)));
    }

}
