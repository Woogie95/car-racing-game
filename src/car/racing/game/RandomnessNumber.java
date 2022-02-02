package car.racing.game;

public class RandomnessNumber {

    private static final int RANDOM_NUMBER_FROM_0_TO_9 = 10;

    public int produceRandomNumber() {
        return (int) (Math.random() * RANDOM_NUMBER_FROM_0_TO_9);
    }

}

