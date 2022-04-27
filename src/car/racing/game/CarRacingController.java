package car.racing.game;

import java.util.ArrayList;
import java.util.List;

public class CarRacingController { // 자동차 경주 제어자

    private static final int RANDOM_NUMBER_FROM_0_TO_9 = 10;
    private static final String SYMBOL = ",";

    private List<Car> cars = new ArrayList<>();

    public void carRacingProcess() { // 자동차 경주 과정
        List<String> carName = divideCarName(Input.inputCarNameMessage());
        preparationCar(carName);


    }

    public void preparationCar(List<String> carName) {
        for (String name : carName) {
            Car car = new Car(name);
            cars.add(car);
        }
        gameRepeatCount(Input.inputRepeatCountMessage(), cars);
    }

    public void showCurrentSituation(int repeatCount, List<Car> cars) {
        for (int i = 0; i < repeatCount; i++) {
            gameRepeatCount(cars);
        }

    }

    public void gameRepeatCount(int repeatCount, List<Car> cars) {
        for (Car car : cars) {
            car.checkPositionCount(repeatCount);
        }

    }

    public static int makeRandomNumber() { // 랜덤 숫자 생성 기능
        return (int) (Math.random() * RANDOM_NUMBER_FROM_0_TO_9);
    }

    public static List<String> divideCarName(String name) { // 이름을 콤마 단위로 나눠주는 기능
        return List.of((name.split(SYMBOL)));
    }


}
