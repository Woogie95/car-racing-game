package car.racing.game;

public class CenterProcess {

    public void startCarRacingProcess(Input input) {
        CarType carType = new CarType();
        carType.divideCarType(input.inputCarName()); // choi sung wook
        input.inputRotateNumberCount();
        Output.executeResultMessage();
        RandomnessNumber randomnessNumber = new RandomnessNumber();

        CompareScore compareScore = new CompareScore();
        compareScore.checkNumberCount(randomnessNumber.produceRandomNumber());

    }
}
