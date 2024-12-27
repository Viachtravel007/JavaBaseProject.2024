package viachtravel007.homework.encapsulation;

public class Demonstration {
    public static void main(String[] args) {
        Employee employee = new Employee(
                "Amanda Clark",
                "Manager",
                "amanda.clark123@zoho.com",
                "+1 (202) 555-0147",
                30
        );

        System.out.println(employee);

        System.out.println();

        Car myCar = new Car();
        myCar.start();
    }
}
