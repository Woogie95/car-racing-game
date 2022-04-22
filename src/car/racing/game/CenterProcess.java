package car.racing.game;

import java.util.ArrayList;
import java.util.List;

public class CenterProcess {

    public List<String> carList = new ArrayList<>();

    public void carRacingProcess() {
        Input input = new Input();
        CarName carName = new CarName();
        carList = carName.divideCarName(input.inputCarName());


        int count = input.inputRotateNumberCount();
        Output.changeLine(); // 줄 띄움
        Output.printResultMessage();


        ScoreComparison scoreComparison = new ScoreComparison();
        RandomnessNumber randomnessNumber = new RandomnessNumber();
        int compareNumber = scoreComparison.checkNumberCount(randomnessNumber.makeRandomNumber());
        prepareUserGame(compareNumber);


    }

    public void prepareUserGame(int position) {
        List<Car> car = new ArrayList<>();
        for (String carName : carList) {
           new Car(carName, position);
            car.add(carType);
        }
    }

}
