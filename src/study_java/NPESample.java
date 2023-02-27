package study_java;

import java.util.Scanner;

public class NPESample {

    private Scanner scanner;

    public NPESample() {
        try {
            int a = scanner.nextInt();              // 초기화가 되어있지 않기 때문에 NullpointerException 발생
        } catch (NullPointerException e) {
            System.out.println("NPE 발생");
        }
    }

    public static void main(String[] args) {
        new NPESample();
    }

}
