package main;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private final List<Car> cars;
    private final List<Car> positions;

    public Cars() {
        this.cars = new ArrayList<>();
        this.positions = new ArrayList<>();
    }

    public void addCar(Car car) {
        this.cars.add(car);
    }

    public void addPosition(Car position) {
        this.positions.add(position);
    }

    public List<Car> getCars() {
        return this.cars;
    }

    public List<Car> getPositions() {
        return this.positions;
    }

}
