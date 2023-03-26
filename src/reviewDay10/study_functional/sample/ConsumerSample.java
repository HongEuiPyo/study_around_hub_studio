package reviewDay10.study_functional.sample;

import java.util.function.Consumer;

// Consumer
// Consumer는 인자를 하나 받고 리턴은 없는 인터페이스
// void accept(T t) 메서드를 제공
public class ConsumerSample {
    public static void main(String[] args) {
        Consumer<String> print = (message) -> System.out.println("Message : " + message);
        print.accept("Around Hub Studio");;
    }
}
