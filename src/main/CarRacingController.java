package main;

import java.util.List;

public class CarRacingController { // 자동차 경주 제어자

    private static final String SYMBOL = ",";

    public void carRacingProcess() { // 자동차 경주 과정
        Cars cars = new Cars();
        for (String name : divideCarName(Input.inputCarNameMessage())) {
            cars.addCar(new Car(name));
        }
        int numberTime = Input.inputRepeatCountMessage(); // 5번
        for (int i = 0; i < numberTime; i++) {

        }
    }


    private static List<String> divideCarName(String name) { // 이름을 콤마 단위로 나눠주는 기능
        return List.of((name.split(SYMBOL)));
    }

}
