package viachtravel007.lesson;

public class Lesson_5 {
    public static void main(String[] args) {
//        RationalOperators();
        TernaryOperator();
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
        int a = 10;
        int b = 25;

        if (a > b) {
            result = 1;
        } else {
            result = -1;
        }

        System.out.println(result);
    }
}
