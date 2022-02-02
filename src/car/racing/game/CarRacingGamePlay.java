package car.racing.game;

public class CarRacingGamePlay { //사실 영어는 나한테 물어보지마 그냥 플레이가 불편하네 보기가
    public static void main(String[] args) {
        CenterProcess centerProcess = new CenterProcess();
        Input input = new Input();
        centerProcess.startCarRacingProcess(input);
    }
}
