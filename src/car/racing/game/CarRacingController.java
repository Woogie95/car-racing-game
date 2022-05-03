package car.racing.game;

import java.util.List;

public class CarRacingController { // 자동차 경주 제어자

    private static final int RANDOM_NUMBER_FROM_0_TO_9 = 10;
    private static final String SYMBOL = ",";

    public void carRacingProcess() { // 자동차 경주 과정
        Cars cars = new Cars();
        for (String name : divideCarName(Input.inputCarNameMessage())) {
            cars.addCar(new Car(name));
        }
    }

    private static int makeRandomNumber() { // 랜덤 숫자 생성 기능
        return (int) (Math.random() * RANDOM_NUMBER_FROM_0_TO_9);
    }

    private static List<String> divideCarName(String name) { // 이름을 콤마 단위로 나눠주는 기능
        return List.of((name.split(SYMBOL)));
    }

}
