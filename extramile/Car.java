package ro.fasttrackit.curs12.homework.extramile;

import java.util.Objects;

public class Car {
    private final String name;
    private final int age;
    private final int kilometers;
    private final double price;

    public Car(String name, int age, int kilometers, double price) {
        this.name = name;
        this.age = age;
        this.kilometers = kilometers;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getKilometers() {
        return kilometers;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return age == car.age &&
                kilometers == car.kilometers &&
                Double.compare(car.price, price) == 0 &&
                Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, kilometers, price);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name = " + name + '\'' +
                ", age = " + age +
                ", kilometers = " + kilometers +
                ", price = " + price +
                '}';
    }
}
