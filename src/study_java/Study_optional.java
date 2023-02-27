package study_java;

import java.util.Optional;

public class Study_optional {

    // java.util.Optional<T>
    // 자바는 Optional<T> 클래스를 통해 Null을 안전하게 사용할 수 있게끔 기능을 제공
    // Optional<T> 클래스는 Null이 올 수 있는 참조 객체를 Wrapping하는 Wrapper 클래스

    // 대표적인 Optional 사용처: Spring Data JPA에서 제공해주는 JPARepository

    public void main(String[] args) {

        // Optional 생성하기
        // 객체의 선언은 Optional 클래스로 사용하고자 하는 레퍼런스 타입을 선언하여 선언
        Optional<String> optionalText;

        // 객체의 초기화는 empty, of, ofNullable과 같은 메서드를 통해 구현할 수 있음
        Optional<String> emptyObject = Optional.empty();                    // null 값으로 초기화
        Optional<String> textObject1 = Optional.of("Text");          // null이 아닌 경우
        Optional<String> textObject2 = Optional.ofNullable("Text");  // null 또는 객체가 있을 수 있는 경우

        // Optional의 다양한 메서드
        // filter
        // filter는 predicate를 사용하며, 해당 값이 참이면 필터를 통과시킴
        Optional<String> sampleObject = Optional.of("Text")
                .filter(object -> "flature".equals(object));

        // map
        // map은 function을 사용하며 입력값을 다른 값으로 변환하는 기능을 제공
        Optional<Integer> stringObject = Optional.of("1234")
                .map(object -> Integer.parseInt(object));

        // flatmap

        // isPresent/isEmpty
        // isPresent는 최종적으로 연산이 끝나고 객체가 존재하는지 확인하는 기능을 제공
        // isEmpty는 isPresent와 반대로 객체가 존재하지 않으면 true를 리턴
        // isPresent
        if (Optional.ofNullable("Text").isPresent()){
            System.out.println("is present");
        }
        // isEmpty
        if (Optional.ofNullable("Text").isEmpty()){
            System.out.println("is empty");
        }

        // ifPresent/ifPresentOrElse
        // ifPresent는 연산을 끝내고 객체가 존재한다면 그 객체를 입력값으로 주는 기능을 제공
        Optional.of("Text")
                .ifPresent(object -> System.out.println(object));

        // get
        // 최종적으로 나온 객체를 Optional에서 꺼내는 기능을 제공
        // 객체가 존재하지 않는다면 예외가 발생
        Optional<String> sampleObject2 = Optional.of("Text");
        System.out.println(sampleObject2.get());

        // orElse
        SampleObject sampleObject3 = Optional.ofNullable(new SampleObject("flature123", "around hub", "12"))
                .orElse(new SampleObject("", "", ""));
        System.out.println(sampleObject3);

        // orElseGet
        // orElseGet은 orElse와 마찬가지로 객체가 비어있다면 기본값으로 제공할 객체를 지정하는 기능을 제공
        // orElse와 차이를 보면 orElseGet은 실제로 객체가 비어있을 경우에만 동작
        SampleObject sampleObject4 = Optional.ofNullable(new SampleObject("flature123", "around hub", "12"))
                .orElseGet(()-> new SampleObject("","",""));
        System.out.println(sampleObject4);

        // the other things

    }

}
