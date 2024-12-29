package viachtravel007.homework.diary_advisor;

public class DayAdvice implements Advice {

    private PlacesToVisit placesToVisit = new PlacesToVisit();

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
                System.out.println("Visit " + placesToVisit.getRandomPlace() + " today!");
                break;
            default:
                break;
        }
    }
}
