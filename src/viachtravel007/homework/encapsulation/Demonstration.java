package viachtravel007.homework.encapsulation;

public class Demonstration {
    public static void main(String[] args) {
        Employee employee = new Employee(
                "John Doe",
                "Manager",
                "johndoe@example.com",
                "+123456789",
                30
        );

        System.out.println(employee);

        System.out.println();

        Car myCar = new Car();
        myCar.start();
    }
}
