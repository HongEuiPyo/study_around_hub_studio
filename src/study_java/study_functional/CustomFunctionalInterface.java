package study_java.study_functional;

// 함수형 인터페이스 (Functional Interface)
// 함수형 인터페이스란 1개의 추상 메서드를 갖는 인터페이스를 뜻함
// java 8 버전 이후에는 Default Method를 사용할 수 있음
// 구현된 함수형 인터페이스는 명시적으로 @FunctionalInterface를 표시하여 요건을 검증할 수 있음

@FunctionalInterface    // 함수형 인터페이스 요건에 맞지 않으면 에러가 발생
public interface CustomFunctionalInterface {

    void called(String message);    // abstract method 하나 구현

    default void printHello() { System.out.println("Hello Around Hub!"); }

}
