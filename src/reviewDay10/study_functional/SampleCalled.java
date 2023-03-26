package reviewDay10.study_functional;

public class SampleCalled {
    public static void main(String[] args) {
        CustomFunctionalInterface customFunctionalInterface = (message) -> { System.out.println(message); };

        String message = "Hello! Around Hub Studio";
        customFunctionalInterface.called(message);

        customFunctionalInterface.printHello();

    }
}
