package car.racing.game;

import java.util.Scanner;

public class Input {

    private static final Scanner SCANNER = new Scanner(System.in);

    public String[] enterCarName() { // 자동차 이름 입력
        participateCarNameMessage();

        String[] carName = SCANNER.nextLine().split(",");

        return carName;
    }

    public static void participateCarNameMessage() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
    }

}
