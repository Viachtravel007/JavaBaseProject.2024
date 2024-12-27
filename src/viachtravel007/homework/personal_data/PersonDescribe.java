package viachtravel007.homework.personal_data;

class PersonDescribe {
    public static void main(String[] args) {
        Person[] persons = {
                new Person("John", 30, "Engineer"),
                new Person("Mary", 25, "Teacher"),
                new Person("Bob", 35, "Doctor"),
                new Person("Alice", 28, "Architect")
        };

        for (Person person : persons) {
            person.info();
        }

        System.out.println();
        persons[3].info();
        persons[3].setProfession("Designer");

        persons[3].info();
    }
}
