package car.racing.game;

import java.util.List;

public class Car {

    public static final int MOVE_VALUE = 4;

    private final List<String> carName;
    private int position;

    public Car(List<String> carName) {
        this.carName = carName;
        this.position = 0;

    }

    public int checkNumberCount(int number) {
        if (MOVE_VALUE >= number) {
            position++;
        }
        return position;
    }

    public List<String> getCarName() {
        return carName;
    }

    public int getPosition() {
        return position;
    }
}
