package viachtravel007.homework.diary_advisor;

import java.util.Scanner;

public class EnteringDay {

    public Days getDayFromUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the day of the week: ");

        String inputDay = scanner.nextLine().toUpperCase();

        try {
            return Days.valueOf(inputDay);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid day entered. Please enter a valid day of the week");
            return null;
        }
    }
}