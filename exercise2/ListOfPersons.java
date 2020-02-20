package ro.fasttrackit.curs12.homework.exercise2;

import java.util.*;

public class ListOfPersons {
    private List<Person> personList = new ArrayList<>();

    public void addPerson(Person person) {
        this.personList.add(person);
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public List<String> extractNamesList() {
        List<String> namesList = new ArrayList<>();
        for (Person person : this.personList) {
            namesList.add(person.getName());
        }
        return namesList;
    }

    public Map<String, Integer> personsNameAndAge() {
        Map<String, Integer> personsMap = new HashMap<>();
        for (Person person : this.personList) {
            personsMap.put(person.getName(), person.getAge());
        }
        return personsMap;
    }

    public Map<String, Integer> personsOlderThan(int age) {
        Map<String, Integer> personsNameAndAge = personsNameAndAge();
        Map<String, Integer> personsOlderThan = new HashMap<>(personsNameAndAge);
        for (String key : personsNameAndAge.keySet()) {
            if (personsNameAndAge.get(key) <= age) {
                personsOlderThan.remove(key);
            }
        }
        return personsOlderThan;
    }

    public Set<String> hairColours() {
        Set<String> hairColours = new HashSet<>();
        for (Person person : this.personList) {
            hairColours.add(person.getHairColour());
        }
        return hairColours;
    }

    public Map<String, List<String>> hairColourAndName() {
        Map<String, List<String>> result = new HashMap<>();
        Set<String> hairColours = hairColours();
        for (String colour : hairColours) {
            List<String> names = new ArrayList<>();
            for (Person person : this.personList) {
                if (colour.toLowerCase().equals(person.getHairColour().toLowerCase())) {
                    names.add(person.getName());
                }
                result.put(colour, names);
            }
        }
        return result;
    }

    public Set<Integer> agesOfPersons() {
        Set<Integer> ages = new HashSet<>();
        for (Person person : this.personList) {
            ages.add(person.getAge());
        }
        return ages;
    }

    public Map<Integer, List<Person>> personsByAge() {
        Set<Integer> ages = agesOfPersons();
        Map<Integer, List<Person>> result = new HashMap<>();
        for (int age : ages) {
            List<Person> persons = new ArrayList<>();
            for (Person person : this.personList) {
                if (age == person.getAge()) {
                    persons.add(person);
                }
                result.put(age, persons);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "ListOfPersons{" +
                "personList = " + personList +
                '}';
    }
}
