package car.racing.game;

public class Output {

    private static final String POSITION_MARK = "-";
    private static final String NAME_POSITION_DELIMITER = " : ";

    public static void printResultMessage() {
        System.out.println("실행 결과");
    }

    public static void printWinMessage(Car car) {
        System.out.println(car.getCarName() + "가 최종 우승했습니다.");
    }

    public static void printPresentSituation(Car car) {
        System.out.print(car.getCarName() + NAME_POSITION_DELIMITER);
        for (int i = 0; i < car.getPosition(); i++) {
            System.out.print(POSITION_MARK);
        }
        changeLine();
    }

    public static void changeLine() {
        System.out.println();
    }

}
