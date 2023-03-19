package reviewDay7.study_functional.sample;

import java.util.function.Predicate;

public class PredicateSample {

    public static void main(String[] args) {
        Predicate<Integer> equalCount = (count) -> count.equals(50);
        System.out.println(equalCount.test(50));
        System.out.println(equalCount.test(20));
    }

}
