package learnprogramming;

public class MyMain {
    public static void main(String[] args) {
        System.out.println("MY Java Program");
        Person objectPerson1 = new Person();
        Person objectPerson2 = new Person();

        objectPerson1.lastName = "Arisetti";
        objectPerson1.firstName = "Kalpana";
        objectPerson1.age = 30;
        objectPerson2.lastName = "Arisetti";
        objectPerson2.firstName = "Sandeep";
        objectPerson2.age = 32;
        System.out.println(objectPerson1.getFirstName());
    }
}
