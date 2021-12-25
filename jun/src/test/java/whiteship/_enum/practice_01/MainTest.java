package whiteship._enum.practice_01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class MainTest {

    @Test
    @DisplayName("valueOf 테스트")
    void valueOf_테스트() {
        Enum<Gender> e = Gender.valueOf(Gender.class, Gender.MAN.name());
        assertThat(Gender.MAN).isEqualTo(e);
    }

    @Test
    @DisplayName("equals 테스트")
    void equals_테스트() {
        Gender man = Gender.MAN;
        Gender woman = Gender.WOMAN;
        assertThat(man).isNotEqualTo(woman);
    }
}