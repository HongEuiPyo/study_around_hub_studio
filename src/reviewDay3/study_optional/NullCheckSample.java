package reviewDay3.study_optional;

import java.util.Scanner;

public class NullCheckSample {

    private Scanner scanner;
    // 더 좋은 방법
    // Null 체크 없이 미리 레퍼런스를 초기화해준다.
    // private Scanner scanner = new Scanner(System.in);

    public NullCheckSample() {
        if (scanner == null) {
            scanner = new Scanner(System.in);
        }
        int a = scanner.nextInt();

        System.out.println(a);
    }

    public static void main(String[] args) { new NullCheckSample(); }

}
