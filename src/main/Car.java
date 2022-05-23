package main;

public class Car {

    private static final int INITIAL_VALUE = 0;
    private static final int CAR_MOVE_CONDITION = 4;
    private static final int RANDOM_NUMBER_FROM_0_TO_9 = 10;

    private final String carName;
    private int position;

    public Car(String carName) {
        this.carName = carName;
        this.position = INITIAL_VALUE;
    }

    public String getCarName() {
        return carName;
    }

    public int getPosition() {
        return position;
    }

    public void IncreasePosition() {
        if (CAR_MOVE_CONDITION >= makeRandomNumber()) {
            position++;
        }
    }

    private void move() {
        position++;
    }

    private static int makeRandomNumber() {
        return (int) (Math.random() * RANDOM_NUMBER_FROM_0_TO_9);
    }

}
