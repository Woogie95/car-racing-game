package main;

public class RearTimeView {
    private static final String HYPHEN = "-";

    public static void showPositionResult(Car car) {
        for (int i = 0; i < car.getPosition(); i++) {
            System.out.print(HYPHEN);
        }
    }
}
