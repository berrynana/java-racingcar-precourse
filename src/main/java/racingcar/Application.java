package racingcar;

import service.RacingCarService;

public class Application {
    public static void main(String[] args) {
        RacingCarService service = new RacingCarService();
        service.playRacingCar();
    }
}
