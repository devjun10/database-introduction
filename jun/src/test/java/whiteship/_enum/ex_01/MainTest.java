package whiteship._enum.ex_01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import whiteship._enum.ex_01.Gender;

class MainTest {

    @Test
    @DisplayName("valueOf 테스트")
    void valueOf_테스트() {
        Enum<Gender> e = Gender.valueOf(Gender.class, Gender.MAN.name());
        Assertions.assertEquals(Gender.MAN, e);
    }

    @Test
    @DisplayName("equals 테스트")
    void equals_테스트() {
        Gender man = Gender.MAN;
        Gender woman = Gender.WOMAN;
        Assertions.assertNotEquals(man, woman);
    }
}