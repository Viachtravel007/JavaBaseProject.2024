package viachtravel007.homework.diary_advisor;

public class DayAdvice implements Advice {

    @Override
    public void advise(Days day) {
        switch (day) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
                System.out.println("Be productive at work today!");
                break;
            case FRIDAY:
                System.out.println("Happy Friday!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Visit the best places for a weekend getaway!");
                break;
            default:
                break;
        }
    }
}
