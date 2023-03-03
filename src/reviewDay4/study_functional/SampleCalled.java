package reviewDay4.study_functional;

import study_java.study_functional.CustomFunctionalInterface;

public class SampleCalled {

    public static void main(String[] args) {
        CustomFunctionalInterface customFunctionalInterface = (message) -> System.out.println(message);

        String message = "Hello! Around Hub Studio";
        customFunctionalInterface.called(message);

        customFunctionalInterface.printHello();

    }
}
