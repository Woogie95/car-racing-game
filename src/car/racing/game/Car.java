package car.racing.game;

public class Car {

    public static final int CAR_MOVE_CONDITION = 4;
    public static final int INITIAL_VALUE = 0;

    private final String carName;
    private int position;

    public Car(String carName) {
        this.carName = carName;
        this.position = INITIAL_VALUE;
    }

    public void moveCar() {
        this.position++;
    }


    public String getCarName() {
        return carName;
    }

    public int getPosition() {
        return position;
    }

    public void checkPositionCount(int randomNumber) {
        if (CAR_MOVE_CONDITION >= randomNumber) {
            this.position += 1;
        }
    }

}
