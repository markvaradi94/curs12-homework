package ro.fasttrackit.curs12.homework.exercise3;

import ro.fasttrackit.curs12.homework.exercise2.Person;

import java.util.Objects;

public class Employee extends Person {
    private String company;
    private double salary;

    public Employee(String name, int age, String hairColour, String company, double salary) {
        super(name, age, hairColour);
        this.company = company;
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 &&
                Objects.equals(company, employee.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), company, salary);
    }

    @Override
    public String toString() {
        return "Employee{" + "name = " + super.getName() +
                ", company = " + company + '\'' +
                ", salary = " + salary +
                '}';
    }
}
