package ro.fasttrackit.curs12.homework.exercise2;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private String hairColour;

    public Person(String name, int age, String hairColour) {
        this.name = name;
        this.age = age;
        this.hairColour = hairColour;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getHairColour() {
        return hairColour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                name.equals(person.name) &&
                hairColour.equals(person.hairColour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, hairColour);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name = " + name + '\'' +
                ", age = " + age +
                ", hairColour = " + hairColour + '\'' +
                '}';
    }
}
