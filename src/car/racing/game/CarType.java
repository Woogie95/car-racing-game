package car.racing.game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarType {

    public List<String> divideCarType(String carName) {
        String[] nameDivide = carName.split(",");
        return new ArrayList<>(Arrays.asList(nameDivide));
    }

    public void

}
