package main;

public class Output {

    private static final String NAME_POSITION_DELIMITER = " : ";

    public static void printNameInputMessage() {
        System.out.println("경주할 자동차 이름을 입력하세요 (이름은 쉼표(,)를 기준으로 구분).");
    }

    public static void printNumberTimeInputMessage() {
        System.out.println("시도할 회수는 몇회 인가요?");
    }

    public static void printResultMessage() {
        System.out.println("실행 결과");
    }

    public static void printRealTimeView(Car car) {
        System.out.print(car.getCarName() + NAME_POSITION_DELIMITER);
        RearTimeView.showPositionResult(car);
        changeLine();
    }


    public static void printWinMessage(String name) {
        System.out.println(name + "가 최종 우승했습니다.");
    }

    public static void changeLine() {
        System.out.println();
    }

}
