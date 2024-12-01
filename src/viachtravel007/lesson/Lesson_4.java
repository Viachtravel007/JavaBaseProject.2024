package viachtravel007.lesson;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Lesson_4 {
    public static void main(String[] args) {
//        BasicMathExample();
//        MobExample();
//        Increment();
//        MathExamples();
//        Random();
        Formatting();
    }

    private static void Formatting() {
        double value = 10.0 / 3;
        System.out.println("value = " + value);

        double result = Math.round(100 * value) / 100.0;
        System.out.println("result = " + result);

        System.out.printf("Rounded value = %05.2f, calculated value = %05d\n", value, 123 + 10);
        System.out.printf("|%10s |%15s |\n", "row1", "row2");
        System.out.printf("|%10s |%15s |\n", "142", "835855");
        System.out.printf("|%10s |%15s |\n", "421415", "1");
    }

    private static void Random() {
        Random random = new Random(1);
        int value = random.nextInt();
        System.out.println(value);
        value = random.nextInt();
        System.out.println(value);
        value = random.nextInt(-1_000_000, 1);
        System.out.println(value);
        value = random.nextInt(10, 20);
        System.out.println(value);
        value = random.nextInt( 1,101);
        System.out.println(value);

        value = ThreadLocalRandom.current().nextInt();
        System.out.println(value);
    }

    public static void MathExamples() {
        long value = 5;
        double result = Math.sqrt(5 * value);
        System.out.println("sqrt(25) = " + result);

        value = 8;
        System.out.println("cbrt(" + value + ") = " + Math.cbrt(value));

        value = Math.round(Math.pow(2, 3));
        System.out.println("value = " + value);
    }

    private static void Increment() {
        int a = 123;
        a += 100;
        a += 100 / 3 - 1;
        System.out.println("a = " + a);

        a++;
        System.out.println("a = " + a);

        ++a;
        System.out.println("a = " + a);

        a = 10;
        int result = 3 + a++; // 3 + ++a = 14
        System.out.println("result = " + result);

        result = 10;
        result = result++ + --result;
        System.out.println("result = " + result);
    }

    private static void MobExample() {
        int a = 15;
        int b = 8;

        int result = a % b;
        System.out.println("15 mob 8 == " + result);
    }

    public static void BasicMathExample() {
        int a = 10;
        int b = 3;

        double result = (double) a / b;
        System.out.println("division = " + result);

        result = a + b;
        System.out.println("addition = " + result);

        result = a - b;
        System.out.println("subtraction = " + result);
    }
}
