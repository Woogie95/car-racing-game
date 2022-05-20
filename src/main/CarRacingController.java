package main;

import java.util.ArrayList;
import java.util.List;

public class CarRacingController {

    private static final String SYMBOL = ",";
    private static final int REPEAT_POSITION_INITIAL_VALUE = 1;
    public static final int REPEAT_INITIAL_VALUE = 0;

    public void carRacingProcess() {
        List<Car> carList = new ArrayList<>();
        for (String carName : divideCarName(Input.inputCarNameMessage())) {
            carList.add(new Car(carName));
        }
        Cars cars = new Cars(carList);
        int repeatCount = Input.inputRepeatCountMessage();
        Output.printResultMessage();
        for (int i = REPEAT_INITIAL_VALUE; i < repeatCount; i++) {
            showRacingSituation(cars);
        }
        Winner.showCarRacingResult(cars);
        Winner.searchMaxValue(cars);
    }

    public static void showRacingSituation(Cars carList) {
        for (Car cars : carList.getCars()) {
            Output.printName(cars.getCarName());
            Output.printPosition();
            cars.IncreasePosition();
            showPosition(cars.getPosition());
            Output.changeLine();
        }
        Output.changeLine();
    }

    public static void showPosition(int position) {
        for (int j = REPEAT_POSITION_INITIAL_VALUE; j < position; j++) {
            Output.printPosition();
        }

    }

    private static List<String> divideCarName(String name) {
        return List.of((name.split(SYMBOL)));
    }

}
