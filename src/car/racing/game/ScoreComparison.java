package car.racing.game;

import static car.racing.game.Car.CAR_MOVE_CONDITION;

public class ScoreComparison {

    public int checkNumberCount(int position) {
        if (CAR_MOVE_CONDITION >= position) {
            position += 1;
        }
        return position;
    }
}
