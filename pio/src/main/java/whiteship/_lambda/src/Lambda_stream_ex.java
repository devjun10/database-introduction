package whiteship._lambda.src;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Lambda_stream_ex {

  public static void main(String[] args) {
    List<String> strings = new ArrayList<>();
    strings.add("hi");
    strings.add("there.");
    strings.add("how");
    strings.add("are");
    strings.add("you");
    strings.add("doing");

    String joinedString1 = strings.stream().collect(Collectors.joining());
    String joinedString2 = strings.stream().map(e -> e + " ").collect(Collectors.joining());
    System.out.println(joinedString1);
    System.out.println(joinedString2);





    Predicate<String> lengthUnderThree = new Predicate<String>() {
      @Override
      public boolean test(String s) {
        return s.length() < 3;
      }
    };
    Predicate<String> lengthUnderThree2 = e -> e.length() < 3;

    List<String> filteredStrings = strings.stream().filter(lengthUnderThree).collect(Collectors.toList());
    List<String> filteredStrings2 = strings.stream().filter(lengthUnderThree2).collect(Collectors.toList());

    // 선언적 프로그래밍
    // filter할 것이다 뭐를? 길이가 3자 이하인 것들을. 어떻게? 그건 신경쓰지 않음.
    // 어떻게 할 것인지는(How) 감추고 무엇을 할지를(What) 지정함.



    filteredStrings.stream().forEach(underThree -> System.out.println(underThree));
    filteredStrings2.forEach(System.out::println);

  }
}
