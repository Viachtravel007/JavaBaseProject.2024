package viachtravel007.lesson;

public class Lesson_5 {
    public static void main(String[] args) {
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
}
