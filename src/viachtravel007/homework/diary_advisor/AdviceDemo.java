package viachtravel007.homework.diary_advisor;

public class AdviceDemo {
    public static void main(String[] args) {
        DayAdvice dayAdvice = new DayAdvice();

        dayAdvice.advise(Days.MONDAY);
        dayAdvice.advise(Days.FRIDAY);
        dayAdvice.advise(Days.SUNDAY);
    }
}