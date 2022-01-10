# Enum

**Typesafe 가 보장되지 않는 아주 단순한 케이스**

```java
public static void main(String[] args){
	System.out.println("hello");
}
```

→ 여기서의 "hello" 메세지는 Typesafe 하지 못하다!!
→ 오타가 나더라도 컴파일러는 알 수 없다!!

<br>

**Typesafe가 보장되는 방법으로 변환!**  

```java
enum Greet{
	Hello("hello"); // 생성자를 호출하는 것임
	
	Greet(String maessage){
		this.message = message;
	}

	String message;

	public String getMessage(){
		return message;
	}
}

public static void main(String[] args){
	System.out.println(Greet.Hello.getMessage());
}
```

→ Typesafe 하지 못한 단순한 문자열 "hello" 를 Greet 라는 열거형의 하나의 타입으로 정의함으로써
→ Typesafe 한 방법으로 message를 출력하도록 개선할 수 있다.


## ordinal() // 우리는 안쓰면 된다. 

열거형을 구분하거나 확인하기 위한 목적으로 ordinal() 를 사용하지 않는 것이 좋다.

ordinal() 메소드가 반환하는 값은 내부적인 용도로만 사용되기 때문이다.

열거형 상수의 값이 불연속적인 경우에는 다음과 같이 열거형 상수의 이름 옆에 원하는 값을 괄호와 함께 작성할 수 있다.
