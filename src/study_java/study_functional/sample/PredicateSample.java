package study_java.study_functional.sample;

import java.util.function.Predicate;

// Predicate
// Predicate는 인자를 받아 Boolean 타입을 리턴하는 인터페이스를 제공
// boolean test(T t) 메서드를 제공

public class PredicateSample {

    public static void main(String[] args) {
        Predicate<Integer> equalsCount = (count) -> count.equals(50);
        System.out.println(equalsCount.test(50));
        System.out.println(equalsCount.test(20));
    }

}
