package car.racing.game;

import java.util.List;

public class Cars {

    public static void winningCarName(List<Car> cars) {
        int max = 0;

        for (Car car : cars) {
            compareCaeScore(car, max);
        }
    }

    public static void compareCaeScore(Car car, int max) {
        if (car.getPosition() > max) {
            max = car.getPosition();
        }
    }

}
