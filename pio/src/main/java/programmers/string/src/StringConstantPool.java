package programmers.string.src;

public class StringConstantPool {

  public static void main(String[] args) {
    String strConstant1 = "string constant";
    String strConstant2 = "string constant";

    System.out.println(strConstant1 == strConstant2); //메모리 주소가 같음. 같은 문자열 상수를 재활용

    String strNew1 = new String("str new");
    String strNew2 = new String("str new");

    System.out.println(strNew1 == strNew2); //메모리 주소가 다름. 같은 문자열 상수값을 가진 String인스턴스를 새롭게 생성

  }

}
