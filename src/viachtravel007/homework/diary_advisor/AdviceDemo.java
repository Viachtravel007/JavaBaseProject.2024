package viachtravel007.homework.diary_advisor;

public class AdviceDemo {
    public static void main(String[] args) {
        EnteringDay enteringDay = new EnteringDay();

        Days day = enteringDay.getDayFromUser();

        if (day != null) {
            DayAdvice dayAdvice = new DayAdvice();
            dayAdvice.advise(day);
        }
    }
}