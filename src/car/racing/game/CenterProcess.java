package car.racing.game;

import java.util.List;

public class CenterProcess {

    public void startCarRacingProcess(Input input) {
        CarType carType = new CarType();
        List<String> carList = carType.divideCarType(); // choi sung wook
        input.inputRotateNumberCount();
        Output.executeResultMessage();
        Car car = new Car();
        car.recordScore(carList);


        RandomnessNumber randomnessNumber = new RandomnessNumber();

        CompareScore compareScore = new CompareScore();

    }
}
