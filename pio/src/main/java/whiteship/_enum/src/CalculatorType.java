package whiteship._enum.src;

public enum CalculatorType {

  CALC_NONE {
    long calculate(long value) { return value;}
  },
  CALC_MULTIPLE_10 {
    long calculate(long value) { return value * 10;}
  },
  CALC_MULTIPLE_3 {
    long calculate(long value) { return value * 3;}
  };

  abstract long calculate(long value); //enum에 추상메서드르르 선언하여 상수들이 이를 구현하도록 강제함.
  //이를 통해 enum이 상태와 행위를 둘 다 가질 수 있어서 클라이언트 측에서는 별도 계산로직을 넣지 않아도 됨.
}
