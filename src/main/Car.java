package main;

public class Car {

    private static final int RANDOM_NUMBER_FROM_0_TO_9 = 10;
    public static final int CAR_MOVE_CONDITION = 4;
    public static final int INITIAL_VALUE = 0;

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

    private void checkPositionCount() { // 비교해서 포지션 ++
        if (CAR_MOVE_CONDITION >= makeRandomNumber()) {
            position++;
        }
    }

    private static int makeRandomNumber() { // 랜덤 숫자 생성 기능
        return (int) (Math.random() * RANDOM_NUMBER_FROM_0_TO_9);
    }

}