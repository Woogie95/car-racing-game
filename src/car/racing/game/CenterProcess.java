package car.racing.game;

import java.util.ArrayList;
import java.util.List;

public class CenterProcess {

    public static CarName carName = new CarName();

    public void startCarRacingProcess(String name, int count) {
        List<String> carArr = carName.divideCarName(name);
        Car car = new Car(carArr);
        Output.executeResultMessage();
        RandomnessNumber randomnessNumber = new RandomnessNumber();
        int position = car.checkNumberCount(randomnessNumber.produceRandomNumber());


        List<Car> carUser = new ArrayList<>();
        for (int i = 0; i < carArr.size(); i++) {
            carUser.add(car);
        }
        Output.printPresentSituation(car.getCarName(), position);
    }

}
