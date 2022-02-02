package car.racing.game;


import java.util.List;

public class Car {

    private String carName;

    public Car() {
        this.carName = "";
    }

    public void recordScore(List<String> car) {
        for (int i = 0; i < car.size(); i++) {
            System.out.println(car.size());
        }
    }

    public void checkNumberCount(int num) {

    }

}
