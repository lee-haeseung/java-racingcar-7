# java-racingcar-precourse

# 기능 목록

- 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
- 각 자동차에 이름을 부여할 수 있다. 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
- 자동차 이름은 쉼표(,)를 기준으로 구분하며 이름은 5자 이하만 가능하다.
- 사용자는 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
- 전진하는 조건은 0에서 9 사이에서 무작위 값을 구한 후 무작위 값이 4 이상일 경우이다.
- 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한 명 이상일 수 있다.
- 우승자가 여러 명일 경우 쉼표(,)를 이용하여 구분한다.
- 사용자가 잘못된 값을 입력할 경우 `IllegalArgumentException`을 발생시킨 후 애플리케이션은 종료되어야 한다.

# 구현할 기능

## 자동차

- [x]  주어진 횟수 동안 자동차의 전진/정지 기능
- [x]  자동차에 이름 부여 기능
- [x]  0에서 9까지의 무작위 값 구하기 및 4 이상인 경우 전진
- [x]  예외 처리
    - [x]  이름 없는 경우
    - [x]  자동차 이름이 5글자를 초과한 경우

## 입력

- [x]  쉼표(,)를 기준으로 구분된 5자 이하의 자동차 이름 입력
- [x]  이동 횟수 입력
- [x]  잘못된 값을 입력한 경우 예외 처리
    - [x]  같은 이름의 자동차가 들어오는 경우
    - [x]  자동차 이름이 5글자를 초과한 경우
    - [x]  이름이 없는 경우 → 오류 출력
    - [x]  시도하는 횟수 입력이 올바르지 않은 경우

## 출력

- [ ]  자동차 출력 (이름과 전진한 정도)
- [ ]  우승자 출력
    - [ ]  여러명인 경우 쉼표(,)로 구분하여 출력