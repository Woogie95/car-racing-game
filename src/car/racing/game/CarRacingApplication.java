package car.racing.game;

public class CarRacingApplication {
    public static void main(String[] args) {
        CenterProcess centerProcess = new CenterProcess();
        Input input = new Input();
        centerProcess.startCarRacingProcess(input.inputCarName(), input.inputRotateNumberCount());
    }
}
