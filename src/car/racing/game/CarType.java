package car.racing.game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarType {

    public List<String> divideCarType() {
        Input input = new Input();
        String[] nameDivide = input.inputCarName().split(",");
        return new ArrayList<>(Arrays.asList(nameDivide));
    }

}
