package service;

import camp.nextstep.edu.missionutils.Randoms;
import domain.Cars;
import domain.GameSettings;
import domain.RacingCarSetting;

public class RacingCarService {
    public void playRacingCar() {
        RacingCarSetting setting = new RacingCarSetting();
        GameSettings gameSetting = setting.makeSettings();
        Cars cars = setting.makeCarList();

        int count = 0;
        while(count < gameSetting.getGameCount()) {
            // 랜덤 변수 생성
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            // car position 증가 또는 그대로

            count++;
        }

        // 우승자 선정
        // 게임 결과 출력
    }


}
