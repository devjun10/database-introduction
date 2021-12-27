package whiteship._lambda.src;

public class Lambda_ex1 {

  public static void main(String[] args) {
    //1. 기존 방식의 코드블록 사용 - 별도의 클래스와 객체 그리고 메서드를 생성해야 함.
    FunctionalInterfaceImplClass functionalInterfaceImplClass = new FunctionalInterfaceImplClass();
    Runnable r = functionalInterfaceImplClass;
    r.run();

    //2. 기존 방식의 코드 블록 사용 - 익명 객체 생성
    Runnable r2 = new Runnable() {
      @Override
      public void run() {
        System.out.println();
        System.out.println("2. 기존 방식의 코드 블록 사용 - 익명 객체 생성");
        System.out.println("별도의 클래스 정의 없이 코드 블록인 메서드를 사용하려고 할 때 익명 객체를 사용(자바 8 이전).\n"
            + "함수형 인터페이스와 동일한 이름으로 익명 클래스를 생성할 수 있음");
      }
    };
    r2.run();

    //3. 새로운 방식의 코드 블록 사용 - 람다
    Runnable r3 = () -> {
      System.out.println();
      System.out.println("3. 새로운 방식의 코드 블록 사용 - 람다");
      System.out.println("익명 객체도 필요x(자바8)");
    };
    r3.run();


  }
}

class FunctionalInterfaceImplClass implements Runnable {

  @Override
  public void run() {
    System.out.println("1. 기존 방식의 코드블록 사용 - 별도의 클래스와 객체 그리고 메서드를 생성해야 함.");
    System.out.println("함수형 인터페이스인 Runnalbe을 구현한 클래스");
  }
}
