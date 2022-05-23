package main;

import java.util.List;

import static main.CarRacingController.REPEAT_INITIAL_VALUE;

public class Output {

    private static final String NAME_POSITION_DELIMITER = " : ";
    private static final String HYPHEN = "-";

    public static void printNameInputMessage() {
        System.out.println("경주할 자동차 이름을 입력하세요 (이름은 쉼표(,)를 기준으로 구분).");
    }

    public static void printNumberTimeInputMessage() {
        System.out.println("시도할 회수는 몇회 인가요?");
    }

    public static void printResultMessage() {
        System.out.println("실행 결과");
    }

    public static void printName(Car car) {
        System.out.print(car.getCarName() + NAME_POSITION_DELIMITER);
//        printPosition(car);
//        Output.printLineChange();
    }


    public static void printPosition(Car cars) {
        for (int j = REPEAT_INITIAL_VALUE; j < cars.getPosition(); j++) {
            System.out.print(HYPHEN);
        }
    }

    public static void printConnectName(Car car) {
        System.out.println(car.getCarName() + ",");
    }

    public static void printWinnerMessage(List<Car> winnerCars) {
        for (Car car : winnerCars) {
            System.out.print(car.getCarName() + ", ");
        }
        System.out.println("(이)가 최종 우승했습니다.");
    }

    public static void printLineChange() {
        System.out.println();
    }
}
