package viachtravel007.lesson;

public class Lesson_5 {
    public static void main(String[] args) {
//        RationalOperators();
//        TernaryOperator();
        ConditionDemo();
    }

    private static void ConditionDemo() {
        int a = 10;
        int b = 1;

        if (a % 2 == 0) {
            if (b % 2 == 0) {
                System.out.println("00");
            } else {
                System.out.println("Unexpected");
            }

        }
    }

    public static void RationalOperators() {
        int a = 10;
        int b = -123;

        boolean result = a > b;
        System.out.println("a > b is " + result);
        result = b > a;
        System.out.println("a < b is " + result);

        result = a >= b;
        System.out.println("a >= b is " + result);
        result = a <= b;
        System.out.println("a <= b is " + result);

        result = a == b;
        System.out.println("a == b is " + result);
        result = a != b;
        System.out.println("a != b is " + result);
    }
    public static void TernaryOperator() {
        int result;
        int a = 40;
        int b = 25;

        result = (a > b) ? a % 2 == 0 ? 123: -123 : -1;

        System.out.println(result);
    }
}
