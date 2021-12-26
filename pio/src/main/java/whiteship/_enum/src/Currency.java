package whiteship._enum.src;

public enum Currency {
  //enum 상수들을 선언하면서 값을 미리 넣어놓고
  PENNY(1), NICKLE(5), DIME(10), QUARTER(25);

  private int myValueName;

  //생성자로는 이름만 붙여주는 느낌?
  Currency(int myValueName) {
    this.myValueName = myValueName;
  }

  //붙여준 이름으로 값을 가져올 수 있음.
  public int myValue() {
    return myValueName;
  }
}

