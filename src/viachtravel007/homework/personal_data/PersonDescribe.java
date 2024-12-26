package viachtravel007.homework.personal_data;

class PersonDescribe {
    public static void main(String[] args) {
        Person[] persons = {
                new Person("John", 30, "Engineer"),
                new Person("Mary", 25, "Teacher"),
                new Person("Bob", 35, "Doctor")
        };

        for (Person person : persons) {
            person.info();
        }

        System.out.println();
        Person person4 = new Person("Alice", 28, "Architect");
        person4.info();

        person4.setProfession("Designer");
        person4.info();
    }
}
