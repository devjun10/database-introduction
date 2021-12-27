package whiteship._lambda.src;


public class Lambda_ex2 {

  public static void main(String[] args) {
    MyFunctionalInterface mfi = a -> a * a; //타입 추론 가능하므로 적어줄 필요 x

    int result = mfi.runSomething(8);
    System.out.println(result);
  }

}
