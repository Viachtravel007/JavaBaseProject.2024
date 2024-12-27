package viachtravel007.homework.encapsulation;

public class Car {
    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
    }

    private void startElectricity() {
        System.out.println("Starting the electricity system");
    }

    private void startCommand() {
        System.out.println("Processing start commands");
    }

    private void startFuelSystem() {
        System.out.println("Starting the fuel system");
    }
}
