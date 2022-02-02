package car.racing.game;

import java.util.List;

public class Output {

    public static void executeResultMessage() { // 실행 결과 메시지
        System.out.println("실행 결과");
    }

    public static void winMessage() {
        System.out.println("가 최종 우승했습니다.");
    }

    public static void printCarName(List<String> name) {
        for (int i = 0; i < name.size(); i++) {
            System.out.println(name.get(i) + " " + ":" + " ");
        }
    }
}
