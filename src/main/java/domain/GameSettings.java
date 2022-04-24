package domain;

import common.Util;

public class GameSettings {

    private final String CAR_NAME_SEPARATOR = ",";
    private String carNames;
    private Integer gameCount;

    public GameSettings(String names, String strCount) {
        this.setCarNames(names);
        this.setGameCount(strCount);
    }

    public String getCarNameString() {
        return carNames;
    }

    public String[] getCarNames() {
        return getCarNameString().split(CAR_NAME_SEPARATOR);
    }

    public void setCarNames(String carNames) {
        validateNames(carNames);
        this.carNames = carNames;
    }

    public Integer getGameCount() {
        return gameCount;
    }

    private void validateNames(String carNames) {
        if (carNames.isEmpty()
            || !carNames.contains(CAR_NAME_SEPARATOR)) {
            throw new IllegalArgumentException();
        }
    }

    public void setGameCount(Integer gameCount) {
        validateCount(gameCount);
        this.gameCount = gameCount;
    }

    public void setGameCount(String strGameCount) {
        Integer gameCount = Util.stringToInteger(strGameCount);
        setGameCount(gameCount);
    }

    private void validateCount(Integer gameCount) {
        if (gameCount < 1) {
            throw new IllegalArgumentException();
        }
    }
}
