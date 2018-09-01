import java.util.ArrayList;

public class Phonebook {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(String name, String number) {
        Person person = new Person(name, number);

        persons.add(person);
    }

    public void printAll() {
        for (Person person : persons) {
            System.out.println(person);
        }
    }

    public String searchNumber(String name) {
        String num = "number not known";

        for (Person person : persons) {
            if (person.getName().equals(name)) {
                num = person.getNumber();
            }
        }

        return num;
    }
}
