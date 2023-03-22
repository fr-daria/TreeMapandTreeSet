import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Катя", "Люлькова", 16));
        list.add(new Person("Аня", "Бауткина", 12));
        list.add(new Person("Никита", "Павлов", 20));
        list.add(new Person("Борис", "Дояркин", 56));
        list.add(new Person("Ларса", "Шевцова", 48));

        list.sort((o1, o2) -> {
            String[] worldOfSurname1 = o1.getSurname().split(" ");
            if (worldOfSurname1.length >= 3) {
                System.out.println("Много слов в фамилии");
            }
            String[] worldOfSurname2 = o2.getSurname().split(" ");
            if (worldOfSurname2.length >= 3) {
                System.out.println("Много слов в фамилии");
            }
            if (o1.getSurname().length() == o2.getSurname().length()) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
            return Integer.compare(o1.getSurname().length(), o2.getSurname().length());
        });

        Predicate<Person> predicate = (Person person) -> person.getAge() < 18;

        list.removeIf(predicate);

        System.out.println(list);
    }
}