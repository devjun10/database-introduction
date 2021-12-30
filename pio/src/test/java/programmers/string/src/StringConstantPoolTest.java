package programmers.string.src;

import java.lang.annotation.Documented;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class StringConstantPoolTest {

  @Test
  @DisplayName("문자열 상수값을 비교")
  void compareConstants() {
    String strConstant1 = "string constant";
    String strConstant2 = "string constant";

    assertThat(strConstant1).isEqualTo(strConstant2);
    assertThat(strConstant1).isSameAs(strConstant2);
  }

  @Test
  @DisplayName("문자열 인스턴스를 비교")
  void compareStringInstances() {
    String strNew1 = new String("str new");
    String strNew2 = new String("str new");

    assertThat(strNew1).isEqualTo(strNew2);
    assertThat(strNew1).isNotSameAs(strNew2);
  }


}
