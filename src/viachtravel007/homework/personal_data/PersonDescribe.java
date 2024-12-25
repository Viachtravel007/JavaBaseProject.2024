package viachtravel007.homework.personal_data;

class PersonDescribe {
    public static void main(String[] args) {
        Person person1 = new Person("John", 30, "Engineer");
        Person person2 = new Person("Mary", 25, "Teacher");
        Person person3 = new Person("Bob", 35, "Doctor");

        System.out.println("Name: " + person1.getName() + ", Age: " + person1.getAge() + ", Profession: " + person1.getProfession());
        System.out.println("Name: " + person2.getName() + ", Age: " + person2.getAge() + ", Profession: " + person2.getProfession());
        System.out.println("Name: " + person3.getName() + ", Age: " + person3.getAge() + ", Profession: " + person3.getProfession());

        Person person4 = new Person("Alice", 28, "Architect");
        System.out.println("\nName: " + person4.getName() + ", Age: " + person4.getAge() + ", Profession: " + person4.getProfession());

        person4.setProfession("Designer");

        System.out.println("(After updating profession)");
        System.out.println("Name: " + person4.getName() + ", Age: " + person4.getAge() + ", Profession: " + person4.getProfession());
    }
}
