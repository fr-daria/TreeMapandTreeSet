public class Person {
    private String name;
    private String surname;
    private int age;

    public Person (String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void setName() {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname() {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setAge() {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " " + surname + " " +
                + age;
    }
}
