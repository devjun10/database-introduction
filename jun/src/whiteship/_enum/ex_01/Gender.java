package whiteship._enum.ex_01;

public enum Gender {
    MAN("남자"), WOMAN("여자");

    private String name;

    Gender(String name) {
        this.name = name;
    }
}
