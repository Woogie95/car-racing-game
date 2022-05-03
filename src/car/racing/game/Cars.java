package car.racing.game;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private final List<Car> cars;

    public Cars() {
        this.cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        this.cars.add(car);
    }


    public static void winningCarName(String name) {

    }

    public static void compareCaeScore(Car car, int max) {

    }

    public List<Car> getCars() {
        return this.cars;
    }

}
