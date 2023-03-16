import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    protected String[] worldOfSurname1;
    protected String[] worldOfSurname2;
    protected int lenght;

    public PersonComparator(int lenght) {
        this.lenght = lenght;
    }

    @Override
    public int compare(Person o1, Person o2) {
        worldOfSurname1 = o1.getSurname().split(" ");
        if (worldOfSurname1.length >= lenght) {
            System.out.println("Много слов в фамилии");
        }
        worldOfSurname2 = o2.getSurname().split(" ");
        if (worldOfSurname2.length >= lenght) {
            System.out.println("Много слов в фамилии");
        }
        if (o1.getSurname().length() == o2.getSurname().length()) {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
        return Integer.compare(o1.getSurname().length(), o2.getSurname().length());
    }
}
