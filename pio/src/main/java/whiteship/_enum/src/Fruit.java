package whiteship._enum.src;

public enum Fruit {
  APPLE, PEACH, BANANA;

  Fruit() {
    System.out.println("모든 상수에 대해 생성자가 호출됨 : " + this.name());
  }
}
