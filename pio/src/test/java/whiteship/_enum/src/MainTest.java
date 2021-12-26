package whiteship._enum.src;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MainTest {

  @Test
  void calculate() {
    long multiply3 = CalculatorType.CALC_MULTIPLE_3.calculate(10);
    assertThat(multiply3).isEqualTo(30);

    long multiply10 = CalculatorType.CALC_MULTIPLE_10.calculate(10);
    assertThat(multiply10).isEqualTo(100);

    long calculateNone = CalculatorType.CALC_NONE.calculate(10);
    assertThat(calculateNone).isEqualTo(10);
  }

  @Test
  void value() {
    int value = Currency.QUARTER.myValue();
    assertThat(value).isEqualTo(25);

    int value2 = Currency.PENNY.myValue();
    assertThat(value2).isEqualTo(1);
  }

}
