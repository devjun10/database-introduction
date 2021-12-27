package whiteship._lambda.src;

public class Lambda_argument_ex {

  public static void main(String[] args) {
    MyFunctionalInterface mfi = a -> a * a;

    doIt(mfi); //람다는 메서드 인자로 사용 가능.
    doIt(x -> x + 10);
  }

  private static void doIt(MyFunctionalInterface mfi) {
    int b = mfi.runSomething(5);

    System.out.println(b);
  }
}


