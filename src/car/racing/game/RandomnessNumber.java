package car.racing.game;

public class RandomnessNumber {

    private static final int RANDOM_NUMBER_FROM_0_TO_9 = 10; // 9로 할 시 0 - 8까지 9개 숫자가 나옴으로 10;

    public int produceRandomNumber() { // 랜덤 숫자 생성하는 메소드
        return (int) (Math.random() * RANDOM_NUMBER_FROM_0_TO_9);
    }
}

