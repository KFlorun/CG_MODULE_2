package ss9_automating_testing_tdd.Thuc_Hanh.AbsoluteNumberTestCase;

public class AbsoluteNumberCalculator {
    public static int findAbsolute(int num) {
        if (num < 0) {
            return -num;
        } else {
            return num;
        }
    }
}
