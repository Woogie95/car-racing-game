package car.racing.game;

import java.util.Scanner;

public class Input {

    private static final Scanner SCANNER = new Scanner(System.in);

    public String inputCarNameMessage() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        return SCANNER.next();
    }

    public int inputRepeatCountMessage() {
        System.out.println("시도할 회수는 몇회 인가요?");
        return SCANNER.nextInt();
    }

}
