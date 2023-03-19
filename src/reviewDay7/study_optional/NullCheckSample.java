package reviewDay7.study_optional;

import java.util.Scanner;

public class NullCheckSample {

    private Scanner scanner;

    public NullCheckSample() {
        if (scanner == null) {
            scanner = new Scanner(System.in);
        }
        int a = scanner.nextInt();

        System.out.println(a);
    }

    public static void main(String[] args) { new NullCheckSample(); }

}
