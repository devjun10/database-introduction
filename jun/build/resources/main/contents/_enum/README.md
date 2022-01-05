# Enum

Java Enum 학습

<br/><br/>

## 1. 비교

열거 타입은 인스턴스들이 고정되어 있기 때문에 간단하게 `==`을 사용하면 된다.

<br/><br/><br/>

## 2. toString

toString 메서드도 구현할 필요가 없다. 열거 객체의 이름 주는 toString 메서드가 자동으로 만들어지기 때문이다.

> toString을 재정의해서 오는 혼란이 더 큰 비용이 들 수 있다.

<br/><br/><br/>
enum의 장점 코드가 단순해지고, 가독성이 좋아짐 enum 키워드를 사용해서 구현의 의도가 열거임을 나타냄 열거체를 비교할 때 실제 값뿐만이 아니라 타입까지도 체크함 열거체의 상숫값이 재정의되더라도 다시 컴파일할
필요없음

<br/><br/><br/>

## 4) name( )

열거 객체가 가지고 있는 문자열을 리턴한다. 이때 리턴되는 문자열은 열거 타입을 정의할때 사용한 상수 이름과 동일하다.

<br/><br/><br/>

## compareTo( )
매개값으로 주어진 열거 객체를 기준으로 전후 몇번째 위치하는지 비교한다.

만약 열거 객체가 매개값의 열거 객체보다 순번이 빠르다면 음수가, 순번이 늦다면 양수가 리턴된다.

<br/><br/><br/>

##. java.lang.Enum

모든 enum들은 내부적으로 java.lang.enum 클래스에 의해 상속된다.

자바는 다중상속을 지원하지 않기 때문에 enum은 다른 클래스를 상속받을 수 없다.

enum생성자는 왜 private 인가?

java에서 enum타입은 열거형을 의미하는 특별한 형태의 클래스이다.

그렇기 때문에 일반 클래스와 같이 생성자가 있어야 한다. 물론 생성자를 만들어 주지 않아도 java가 default 생성자를 만들어주긴 하지만, enum의 경우에는 생성자의 접근제어자를 private로 지정한다.

enum타입은 고정된 상수들의 집합으로써, 런타임이 아닌 컴파일타임에 모든 값을 알고있어야 합니다. 즉 다른 패키지나 클래스에서 enum 타입에 접근해서 동적으로 어떤 값을 정해줄 수 없다.

해당 enum클래스 내에서 까지도 new키워드로 인스턴스 생성이 불가능하다.

이렇게 하면 외부에서 접근 가능한 생성자가 없으므로 enum타입은 실제적으로 final과 다름이 없다.




## 메서드

|   No  |<center>스터디</center>   |이동|                                                    
|:-----:|:-----------------------|:------------------------------------------------------------------------------:|
|   1   |&nbsp; EnumSet.allOf()       |열거 전체를 추가 |
|   2   |&nbsp; EnumSet.noneOf()      |빈 EnumSet 반환|
|   3   |&nbsp; EnumSet.range()       |하위집합 생성    |
|   3   |&nbsp; EnumSet.complementOf()|[이동](https://www.youtube.com/c/%EB%89%B4%EB%A0%89%EC%B2%98/playlists)          |
|   3   |&nbsp; EnumSet.copyOf()      |[이동](https://programmers.co.k

EnumSet.noneOf() : 비어있는 EnumSet 반환
EnumSet.range() : Enum의 하위집합을 만든다.
EnumSet.complementOf() : 매개변수로 전달된 요소로 제외한다.
EnumSet.copyOf() : 다른 EnumSet의 모든 요소를 복사하여 EnumSet을 만들 수 있다.
장점
사용자는 어떤 구현 객체가 적합한지 몰라도 상관없다.
사용자는 빈번하게 발생되는 EnumSet 초기화 과정을 간단히 진행할 수 있다.
EnumSet의 확장성과 유지보수의 이점

<br/><br/><br/><br/>

## 상수 특정 메서드(constant-specific method)

````java
public enum Direction {
   SOUTH, NORTH, EAST, WEST;
}
````
````java
public class Direction {

    public static final Direction SOUTH = new Direction();
    public static final Direction NORTH = new Direction();
    public static final Direction EAST = new Direction();
    public static final Direction WEST = new Direction();

    private String name;

    private Direction(String name) {
        this.name = name;
    }
}
````

Class<T> getDeclaringClass() : 열거형 상수의 열거형 타입에 해당하는 Class 객체를 반환합니다.

두개의 열거형 상수 e1과 e2가 있을 때, e1.getDeclaringClass() == e2.getDeclaringClass() 가 true인 경우에만 동일한 열거형 타입입니다.
(이 메서드가 반환하는 Class 객체는 상수 특정 클래스 본문이 있는 열거형 상수에 대해 Object.getClass()가 반환한 값과 다를 수 있습니다.)


EnumSet에 new 연산자를 사용하지 않는 이유
(참고 : siyoon210.tistory.com/152)

EnumSet은 다른 컬렉션들과 달리 new 연산자를 사용할 수 없는 대신 정적 팩토리 메서드로 EnumSet의 구현 객체를 반환받을 수 있다.


<br/><br/><br/><br/>

## java.lang.Enum
Enum 클래스는 모든 java 언어 열거타입의 상위 클래스다. 

<br/><br/><br/><br/>

## EnumSet

열거형 타입과 함께 사용하기 위한 특별한 Set 구현체입니다.



enum set의 모든 요소는 set을 만들 때 명시적으로 또는 암묵적으로 지정된 단일 열거형 타입에서 가져와야 합니다.

enum set은 내부적으로 비트 벡터(Bit Vector)로 표현합니다. 비트 벡터를 사용하면 메모리 사용을 크게 줄일 수 있습니다. EnumSet을 구현할 때 공간 및 시간 성능은 기존 int 기반 "비트 플래그(bit flag)"의 대안으로 사용할 수 있을만큼 고수준 이어야 합니다. 대량작업(예를들어 : containsAll 및 preserveAll)도 인수가 enum set인 경우 매우 빠르게 실행되어야 합니다.



iterator 메서드에 의해 반환된 iterator는 자연순서(열거형 상수가 선언된 순서)로 요소를 순회합니다.



Null 요소는 허용되지 않습니다. null 요소를 삽입하려고 하면 NullPointException이 발생합니다.

하지만 null 요소가 있는지 테스트하거나 제거하려는 시도는 제대로 동작합니다.



대부분의 Collection 구현과 마찬가지로 EnumSet은 동기화 되지 않습니다. 여러 쓰레드가 동시에 enum set에 접근하고 적어도 하나의 쓰레드가 집합을 수정하는 경우 외부적으로 동기화되어야 합니다. 이것은 일반적으로 enum set을 자연스럽게 캡슐화하는 일부 객체에서 동기화하여 수행됩니다.

이러한 개체가 없으면 Collections.synchronizedSet(Set<T>) 메서드를 사용하여 set을 "래핑" 해야합니다.

이것은 실수로 동기화되지 않은 접근을 방지하기위해 생성 시 최선의 행동입니다.

아래와 같이 사용할 수 있습니다.

> Set<MyEnum> set =Collections.synchronizedSet(EnumSet.noneOf(MyEnum.class);

EnumSet의 생성자
EnumSet 클래스에는 생성자가 존재하지 않습니다. 존재하지 않는 이유는 이 목록의 가장 아래에서 다루겠습니다!



EnumSet의 메서드
public static <E extends Enum<E>> EnumSet<E> noneOf(Class<E> elementType)

매개변수로 받은 요소 타입을 사용하여 비어있는 enum set을 생성합니다.

public static <E extends Enum<E>> EnumSet<E> allOf(Class<E> elementType)

매개변수로 받은 타입의 모든 요소(열거형 상수들)를 포함하는 enum set을 만듭니다.

public static <E extends Enum<E>> EnumSet<E> copyOf(EnumSet<E> s)


매개변수로 받은 EnumSet과 동일한 타입을 사용하여 동일한 요소를 포함하는 enum set을 만듭니다.

public static <E extends Enum<E>> EnumSet<E> copyOf(Collection<E> c)

매개변수로 받은 Collection으로 초기화 된 enum set을 만듭니다.
(지정된 Collection이 EnumSet 인스턴스인 경우 copyOf(EnumSet<E> s)와 동일하게 작동합니다.)

그렇지 않다면 지정된 Collection에 하나 이상의 요소가 있어야 합니다.
(새 enum set의 요소 타입을 결정하기 위해)

public static <E extends Enum<E>> EnumSet<E> complementOf(EnumSet<E> s)

매개 변수의 EnumSet<E> s 에 포함되어 있지 않은 요소들을 포함하는(차집합) enum set을 만듭니다.



## EnumSet에 new 연산자를 사용하지 않는 이유
(참고 : siyoon210.tistory.com/152)



EnumSet은 다른 컬렉션들과 달리 new 연산자를 사용할 수 없습니다.



정적 팩토리 메서드(static factory method)만으로 EnumSet의 구현 객체를 반환받을 수 있습니다.



// Month의 열거형을 다룰 수 있는 enum set을 반환
EnumSet enumSet1 = EnumSet.noneOf(Month.class);

// Month의 모든 열거형 상수를 가지고 있는 enum set을 반환
EnumSet enumSet2 = EnumSet.allOf(Month.class);



EnumSet 클래스의 noneOf() 메서드를 보면 내부적으로 EnumSet을 상속받은 RegularEnumSet과 JumboEnumSet을 생성해서 반환해주고 있습니다.(상속받은 두개의 클래스 역시 생성자가 public 하지않아서 사용자가 임의로 생성자를 호출할 수 없는 구조입니다. -> 메서드를 통해서만 객체를 반환받을 수 있습니다.)



EnumSet은 왜 생성자를 사용자가 호출할 수 없게 만들었을까요?


사용자의 편의성 1 - 사용자는 어떤 구현객체가 적합한지 몰라도 상관없습니다

RegularEnumSet은 원소의 개수가 적을 때 적합하고, JumboEnumSet은 원소의 개수가 많을 때 적합하지만, 이는 EnumSet의 구현체들은 모두 알고 있는 사용자가 아니라면 복잡한 선택지가 될 수 있습니다. 하지만 EnumSet을 가장 잘 알고있는 EnumSet을 개발한 개발자가 구현 객체를 반환해 준다면 EnumSet을 사용하는 입장에서는 어떤 구현체가 적합한지 고려하지 않아도 됩니다.

사용자 편의성 2 - 사용자는 빈번하게 EnumSet 초기화 과정을 간당히 진행할 수 있습니다

EnumSet이 다루는 Enum의 모든 원소들을 Set에 담는 행위는 빈번하게 수행될 것으로 예상되는 일입니다. 이러한 경우를 대비하여서 EnumSet의 allOf 라는 메서드를 사용하면 모든 Enum 요소가 담겨있는 EnumSet을 쉽게 반환받고 사용할 수 있습니다.

EnumSet의 확장성과 유지보수의 이점

EnumSet을 유지보수하는 과정에서 RegularEnumSet과 JumboEnumSet 이외에 다른 경우를 대비하는 구현클래스가 추가 된다고 하여도 내부에 감추어져 있기 때문에, EnumSet을 사용하던 기존의 코드에는 전혀 영향이 없습니다. 심지어 RegularEnumSet이 삭제된다 하더라도 사용자에게 영향이 없습니다. 이는 EnumSet의 확장성의 큰 이점으로 작용할 수 있습니다.

<br/><br/><br/><br/>

## EnumMap
enum type 키와 함께 사용하기 위한 특수한 Map 구현체입니다. enum map의 모든 키는 map이 생성될 때 명시적으로 또는 암시적으로 지정된 단일 열거형 타입에서 가져와야합니다. enum map은 내부적으로 배열로 표시됩니다. EnumMap은 매우 간결하고 효율적입니다.



enum map은 열거형 상수가 선언된 수서로 키의 순서가 유지됩니다. 이는 컬렉션 뷰 (keySet(), entrySet(), values())의 반환값에도 반영됩니다.



Null 요소는 허용되지 않습니다. null 요소를 삽입하려고 하면 NullPointException이 발생합니다.

하지만 null 요소가 있는지 테스트하거나 제거하려는 시도는 제대로 동작합니다.



대부분의 컬렉션 구현과 마찬가지로 EnumMap은 동기화되지 않습니다. 여러 쓰레드가 동시에 enum map에 접근하고 쓰레드 중 하나 이상이 map을 수정하는 경우 외부에서 동기화해야합니다. 일반적으로 enum map을 자연스럽게 캡슐화하는 일부 객체에서 동기화하여 수행됩니다. 이러한 객체가 없으면 Collections.synchronizedMap(Map<K, V>) 메서드를 사용하여 맵을 "래핑" 해야합니다. 이는 실수로 동기화되지 않은 접근을 방지하기 위해 생성시 가장 최선의 방법입니다.

> Map<EnumKey, V> m = Collections.synchronizedMap<new EnumMap<EnumKey, V>(...));

EnumSet
enum을 사용한 Set의 구현체다. EnumSet이 생성될 때, 한 가지의 enum 타입만 원소로 가질 수 있다.

iterator() 메소드에서 반환되는 iterator는 각 원소가 선언된 순서로 모든 원소를 탐색한다.
null은 원소로 받지 않는다. EnumSet에 null을 원소로 넣으려고 시도할 경우 NullPointerException이 발생한다.
EnumSet의 iterator의 경우 iteration이 진행되는 도중에는 ConcurrentModificationException을 던지지 않는다.
멀티 쓰레드 환경에서 사용될 경우 다른 Collection과 같은 이슈를 가질 수 있다
EnumSet은 멀티 쓰레딩 환경에서 consistency를 지키기 어려울 수 있다. 따라서 오라클의 java api 문서에서는 몇몇 객체와 함께 자연스럽게 synchronized되거나 그런 객체가 없을 경우 Collections.synchronizedSet(java.util.Set<T>)으로 wrapping하여 사용하는 것을 제안하고 있다.

EnumSet은 내부적으로 bit vector로 표현된다
비트 필드를 이용하면 합집합이나 교집합과 같은 집합 연산을 효율적으로 수행할 수 있다. 그리고 EnumSet은 내부적으로 bit vector로 표현되기 때문에 하나의 enum type에서 추출한 집합 값을 효율적으로 나타내고 연산할 수 있다. 만일, enum 타입이 64개 이하 요소라면, 그 EnumSet 전체가 하나의 long 타입으로 표현될 수 있는 것이다.

<br/><br/><br/><br/>