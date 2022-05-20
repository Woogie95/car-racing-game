package main;

import static main.CarRacingController.REPEAT_INITIAL_VALUE;

public class Winner {

    private static final int MAX_INITIAL_PRICE = 0;

    public static void showCarRacingResult(Cars carsList) {

        for (Car cars : carsList.getCars()) {
            Output.printName(cars.getCarName());
            showPosition(cars);
            Output.changeLine();
        }
        Output.changeLine();
    }

    public static void showPosition(Car carList) {
        for (int j = REPEAT_INITIAL_VALUE; j < carList.getPosition(); j++) {
            Output.printPosition();
        }
    }


    public static void searchMaxValue(Cars carsList) {

        int maxPosition = MAX_INITIAL_PRICE;

        for (Car max : carsList.getCars()) {
            maxPosition = Math.max(max.getPosition(), maxPosition);
        }
        connectWinnerName(carsList, maxPosition);
    }

    public static void connectWinnerName(Cars carsList, int maxPosition) {
        StringBuilder connectName = new StringBuilder();

        for (int i = 0; i < carsList.getCars().size(); i++) {
            if (maxPosition == carsList.getCars().get(i).getPosition()) {
                connectName.append(carsList.getCars().get(i).getCarName()).append(" ");
            }
        }
        Output.printWinMessage(connectName);
    }
}
