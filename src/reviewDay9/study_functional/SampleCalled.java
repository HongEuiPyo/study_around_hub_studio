package reviewDay9.study_functional;

import reviewDay8.study_functional.CustomFunctionalInterface;

public class SampleCalled {
    public static void main(String[] args) {
        CustomFunctionalInterface customFunctionalInterface = (message) -> { System.out.println(message); };

        String message = "Hello! Around Hub Studio";
        customFunctionalInterface.called(message);

        customFunctionalInterface.printHello();

    }
}
