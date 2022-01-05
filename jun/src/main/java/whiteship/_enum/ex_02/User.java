package whiteship._enum.ex_02;

public class User implements Moveable {

    @Override
    public String moveSouth(Direction direction) {
        return "남쪽으로 이동";
    }

    @Override
    public String moveNorth(Direction direction) {
        return "북쪽으로 이동";
    }

    @Override
    public String moveWest(Direction direction) {
        return "서쪽으로 이동";
    }

    @Override
    public String moveEast(Direction direction) {
        return "동쪽으로 이동";
    }
}
