package ro.fasttrackit.curs12.homework.exercise2;

public class Main {
    public static void main(String[] args) {
        ListOfPersons personList = new ListOfPersons();
        personList.addPerson(new Person("Mark", 26, "brown"));
        personList.addPerson((new Person("Ion", 37, "bald")));
        personList.addPerson((new Person("Vasile", 54, "grey")));
        personList.addPerson((new Person("Ana", 26, "black")));
        personList.addPerson((new Person("Mara", 37, "blond")));
        personList.addPerson((new Person("Max", 39, "brown")));
        personList.addPerson((new Person("Rares", 44, "black")));
        personList.addPerson((new Person("Renata", 26, "brown")));

        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println(personList.getPersonList());
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println(personList.extractNamesList());
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println(personList.personsNameAndAge());
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println(personList.personsOlderThan(37));
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println(personList.hairColours());
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println(personList.hairColourAndName());
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println(personList.personsByAge());
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}
