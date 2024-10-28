package racingcar;

import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Application {
    public static void main(String[] args) {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String carNameStrings = Console.readLine();

        // model 생성
        List<Car> cars = new ArrayList<>();
        Set<String> carNamesSet = new HashSet<>();
        for (String carName : carNameStrings.split(",", -1)) {
            if (carNamesSet.contains(carName)) {
                throw new IllegalArgumentException();
            }
            cars.add(new Car(carName));
            carNamesSet.add(carName);
        }

        System.out.println("시도할 횟수는 몇 회인가요?");
        String playTimeString = Console.readLine();

        int playTime = -1;
        try {
            playTime = Integer.parseInt(playTimeString);
        } catch (Exception e) {
            throw new IllegalArgumentException();
        }
        if (playTime < 0) {
            throw new IllegalArgumentException();
        }
    }
}
