package car.racing.game;

import java.util.List;

public class CenterProcess {

    public void startCarRacingProcess() {
        Input input = new Input();
        CarName carName = new CarName();
        List<String> carType = carName.divideCarName(input.inputCarName());
        int count = input.inputRotateNumberCount();
        Output.executeResultMessage();


    }
}
