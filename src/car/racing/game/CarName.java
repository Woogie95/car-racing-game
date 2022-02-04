package car.racing.game;

import java.util.Arrays;
import java.util.List;

public class CarName {

    private static final String COMMA = ",";

    public List<String> divideCarName(String Name) {
        return Arrays.asList(Name.split(COMMA));
    }

}
