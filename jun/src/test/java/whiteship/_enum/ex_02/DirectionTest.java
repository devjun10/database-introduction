package whiteship._enum.ex_02;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import whiteship._enum.ex_02.Direction;


class DirectionTest {

    /**
     * 앞에서 뒤를 뺀다.
     * */
    @Test
    @DisplayName("순서 확인")
    void 순서정보() throws Exception {
        int minus = -1;
        int zero = 0;
        int plus = 1;
        int minusThree = -3;

        Direction first = Direction.SOUTH;
        Direction second = Direction.NORTH;
        Direction fourth = Direction.WEST;

//        assertThat(minus).isSameAs(first.compareTo(Direction.NORTH));
//        assertThat(zero).isSameAs(second.compareTo(Direction.NORTH));
//        assertThat(minusThree).isSameAs(first.compareTo(Direction.WEST));
    }

    @Test
    @DisplayName("")
    void m() throws Exception {

    }

}