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

        Collections.sort(list, Comparator.comparingInt(o -> o.getSurname().length()));

        Predicate<Person> predicate = (Person person) -> person.getAge() < 18;

        list.removeIf(predicate);

        System.out.println(list);
    }
}