package car.racing.game;

import java.util.ArrayList;
import java.util.List;

public class CenterProcess {

    public static List<String> carList = new ArrayList<>();
    public Input input = new Input();

    public void carRacingProcess() {
        CarName carName = new CarName();
        carList = carName.divideCarName(input.inputCarNameMessage()); // 이름 입력



    }

    public void runGame() { // 중앙에서 카 객체를 가진 리스트로 놀기 때문에 중앙에 위치
        List<Car> cars = new ArrayList<>();
        for (String carName : carList) {
            cars.add(new Car(carName));
        }
        Output.changeLine();
        Output.printResultMessage();
        showCurrentSituation(input.inputRepeatCountMessage(), cars);
    }

    public void showCurrentSituation(int repeat, List<Car> cars) { // 현재 상황 보여주는 메소드
        for (int i = 0; i < repeat; i++) {
            for (Car car : cars) {
                car.moveCar();
            }
        }
    }

}
