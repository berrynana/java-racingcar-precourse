package domain;

import camp.nextstep.edu.missionutils.Console;

public class RacingCarSetting {

    private GameSettings gameSettings;
    private Cars cars;

    public GameSettings makeSettings() {
        System.out.println("경주 할 자동차 이름(이름은 쉼표(,) 기준으로 구분)");
        String carNames = Console.readLine();

        System.out.println("시도할 횟수");
        String gameCount = Console.readLine();

        gameSettings = new GameSettings(carNames, gameCount);
        return gameSettings;
    }

    public Cars makeCarList() {
        String[] names = gameSettings.getCarNames();
        Cars cars = new Cars(names);
        return cars;
    }


}
