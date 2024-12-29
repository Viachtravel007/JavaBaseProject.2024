package viachtravel007.homework.diary_advisor;

import java.util.Random;

public class PlacesToVisit {

    private String[] places = {
            "Sofiyivsky Cathedral",
            "Kyiv ZOO",
            "Gulliver Shopping Mall",
            "Kiev Opera House",
            "Sky Family Park",
            "Bessarabsky Market",
            "Kiev Nightlife Clubs",
            "Arena City",
            "Pinchuk Art Centre",
            "Hydropark",
            "Kiev Comedy Club",
            "work",
            "shower",
            "Saint Sophia Cathedral",
            "Kyiv Pechersk Lavra",
            "Saint Michael's Golden-Domed Cathedral",
            "Andriyivskyy Descent",
            "Maidan Nezalezhnosti"
    };

    public String getRandomPlace() {
        Random random = new Random();
        int index = random.nextInt(places.length);
        return places[index];
    }
}