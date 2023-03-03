package reviewDay4.study_functional.sample;

import java.util.function.BiFunction;
import java.util.function.Function;

// Function
// Function은 T타입의 인자를 받아 R타입의 객체를 리턴하는 인터페이스
// R apply(T t) 메서드를 제공
public class FunctionSample {

    public static void main(String[] args) {
        Function<String, String> function = (message) -> "Message : " + message;
        System.out.println(function.apply("Around Hub Studio!"));;

        BiFunction<String, Integer, String> biFunction = (message, count) -> {
            int resultCount = count + 10;
            return "Message : " + message + ", count : " + resultCount;
        };

        System.out.println(biFunction.apply("Around Hub Studio!", 5));

    }

}
