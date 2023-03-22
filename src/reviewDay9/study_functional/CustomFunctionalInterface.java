package reviewDay9.study_functional;

// 함수형 인터페이스(Functional Interface)
// 함수형 인터페이스란 1개의 추상 메서드를 갖는 인터페이스를 뜻함
// java 8 버전 이후에는 Default Method를 사용할 수 있음
// 구현된 함수형 인터페이스는 명시적으로 @FunctionalInterface를 표시하여 요건을 검증할 수 있음
@FunctionalInterface
public interface CustomFunctionalInterface {

    void called(String message);

    default void printHello() { System.out.println("Hello Around Hub!"); }

}
