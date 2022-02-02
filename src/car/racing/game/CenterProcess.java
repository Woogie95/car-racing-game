package car.racing.game;

public class CenterProcess {

    public void startCarRacingProcess() {
        Input input = new Input();
        input.inputCarName();
        input.inputRotateNumberCount();

        Output.executeResultMessage();
        CarType carType = new CarType();
        carType.divideCarType(input.inputCarName());

    }
}
