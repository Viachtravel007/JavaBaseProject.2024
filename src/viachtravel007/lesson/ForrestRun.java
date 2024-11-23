package viachtravel007.lesson;

public class ForrestRun {
    public static void main(String[] args) {
        int DangerLevel = 1;

        if (DangerLevel < 20) {
            System.out.println("all OK");
        } else if (DangerLevel < 50) {
                System.out.println("Run, Forrest, run!");
        } else {
            System.out.println("DANGER, RUUUUUUN!");
        }
    }
}
