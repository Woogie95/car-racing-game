package racing1;

import java.util.ArrayList;
import java.util.List;

public class Winner {

    private static final int MAX_INITIAL_PRICE = 0;

    public static List<Car> searchMaxValue(Cars cars) {
        List<Car> winnerCars = new ArrayList<>();
        int max = cars.getCars().get(0).getPosition();
        for (Car car : cars.getCars()) {
            max = 최대값찾아(car, max);
        }
        for (Car car : cars.getCars()) {
            똑같은놈찾아(car, max, winnerCars);
        }
        return winnerCars;
    }

    public static int 최대값찾아(Car car, int max) {
        return Math.max(car.getPosition(), max);
    }

    public static void 똑같은놈찾아(Car car, int max, List<Car> cars) {
        if (car.getPosition() == max) {
            cars.add(car);
        }
    }

}