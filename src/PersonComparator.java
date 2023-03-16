import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    protected int[] worldOfSurname;

    public PersonComparator(int lenght) {
        worldOfSurname = Person.getSurname.split(" ");
        if (worldOfSurname.length >= lenght) {
        }
    }

    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getSurname().length() == o2.getSurname().length()) {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
        return Integer.compare(o1.getSurname().length(), o2.getSurname().length());
    }
}
