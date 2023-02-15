package andrijasevic.person.info;

public class OutputpPersonalInformation {
    public static void main(String[] args) {
        Person person1 = new Person("John", "Doe", "New York", "555-1234");
        Person person2 = new Person("Jane", "Doe", "Los Angeles", "555-5678");
        Person person3 = new Person("Bob", "Smith", "Chicago", "555-9012");

        System.out.println(person1.personInfo());
        System.out.println(person2.personInfo());
        System.out.println(person3.personInfo());
    }
}
