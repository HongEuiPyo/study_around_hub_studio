package reviewDay3.study_functional.sample;

import java.awt.datatransfer.StringSelection;
import java.util.function.Supplier;

// Supplier 는 인자를 받지 않고 T타입의 객체를 리턴하는 인터페이스
// T get() 메서드를 제공
public class SupplierSample {

    public static void main(String[] args) {
        Supplier<String> getMessage = () -> "Around Hub Studio!";
        System.out.println(getMessage.get());
    }

}
