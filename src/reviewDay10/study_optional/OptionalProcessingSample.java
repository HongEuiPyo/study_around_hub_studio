package reviewDay10.study_optional;

import java.util.Optional;

public class OptionalProcessingSample {

    public OptionalProcessingSample() {

        // filter: prediacte를 사용하며, 해당 값이 참이면 필터를 통과시킴
        Optional<SampleObject> sampleObject1 = Optional.of(getObject())
                .filter(object -> "hong".equals(object.getName()));
        System.out.println(sampleObject1.get());

        // map: function을 사용하며 입력값을 다른 값으로 변환하는 기능을 제공
        Optional<String> stringObject1 = Optional.of(getObject())
                .map(sampleObject -> sampleObject.getName());
        System.out.println(sampleObject1.get());

        // ifPresent: 연산을 끝내고 객체가 존재한다면 그 객체를 입력값으로 주는 기능을 제공
        Optional.of(getObject())
                .ifPresent(object -> System.out.println(object));

        // ifPresentOrElse
        Optional.ofNullable(getNullObject())
                .ifPresentOrElse(object -> {
                    System.out.println(object);
                }, () -> {
                    System.out.println("null object");
                }
            );

        // isPresent: 최종적으로 연산이 끝나고 객체가 존재하는지 확인하는 기능을 제공
        if (Optional.ofNullable(getObject()).isPresent()) {
            System.out.println("is present!");
        }

        // isEmpty: isPresent와 반대로 객체가 존재하지 않으면 true를 리턴
        if (Optional.ofNullable(getNullObject()).isEmpty()) {
            System.out.println("is empty!");
        }

        // get: 최종적으로 나온 객체를 Optional에서 꺼내는 기능을 제공, 객체가 존재하지 않는다면 예외발생
        Optional<SampleObject> sampleObject3 = Optional.of(getObject());
        System.out.println(sampleObject3.get());

        // orElse: 값이 있어도 실행됨
        SampleObject sampleObject4 = Optional.ofNullable(getNullObject())
                .orElse(new SampleObject("hong123", "Around Hub", "12"));

        // orElseGet: supplier를 인자로 받음, 값이 없을 때만 실행됨
        SampleObject sampleObject5 = Optional.ofNullable(getNullObject())
                .orElseGet(() -> new SampleObject("1234", "Around Hub", "12"));
        System.out.println(sampleObject5);
    }

    private SampleObject getNullObject() { return null; }

    private SampleObject getObject() { return new SampleObject("hong", "31", "Around Hub Studio"); }

    public static void main(String[] args) { new OptionalProcessingSample(); }

}
