package reviewDay9.study_functional.sample;

import java.util.function.Supplier;

// Supplier는 인자를 받지 않고 T타입의 객체를 리턴하는 인터페이스
// T get() 메서드를 제공
public class SupplierSample {

    public static void main(String[] args) {
        Supplier<String> getMessage = () -> "Around Hub Studio!";
        System.out.println(getMessage.get());
    }

}
