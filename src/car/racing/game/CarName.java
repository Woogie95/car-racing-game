package car.racing.game;

import java.util.ArrayList;
import java.util.List;

public class CarName {

    private static final String SYMBOL = ",";

    public List<String> divideCarName(String Name) {
        return new ArrayList<>(List.of(Name.split(SYMBOL)));
    }

}
