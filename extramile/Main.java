package ro.fasttrackit.curs12.homework.extramile;

public class Main {
    public static void main(String[] args) {
        CarShop shop = new CarShop();
        shop.addCar(new Car("Ford Mondeo", 10, 150000, 5500.75));
        shop.addCar(new Car("Volvo V60", 4, 50000, 11500));
        shop.addCar(new Car("Nissan Patrol", 20, 260000, 5000.95));
        shop.addCar(new Car("Mercedes C-Class", 11, 157000, 6800.13));
        shop.addCar(new Car("Ford Mondeo", 2, 30000, 25000.75));
        shop.addCar(new Car("Audi A6", 1, 5000, 35000.75));
        shop.addCar(new Car("Toyota Auris", 3, 51245, 10500.33));
        shop.addCar(new Car("Nissan Patrol", 5, 75412, 9500));
        shop.addCar(new Car("Volvo V60", 12, 200000, 3500));
        shop.addCar(new Car("Ford Mondeo", 17, 250000, 2500.75));
        shop.addCar(new Car("Mercedes C-Class", 1, 9000, 45500));
        shop.addCar(new Car("VW Golf", 11, 275000, 3700));
        shop.addCar(new Car("VW Golf", 16, 360000, 1700));
        shop.addCar(new Car("Dacia Logan", 2, 7400, 68000));
        shop.addCar(new Car("Dacia 1310", 37, 550000, 85000));
        shop.addCar(new Car("Lada Niva", 40, 742900, 120000));

        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println(shop.getCarList());
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println(shop.numberOfCarsByName());
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println(shop.carsByNameAndKilometers());
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println(shop.carsByKilometerRange());
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println(shop.carsByPriceRange());
        System.out.println("-----------------------------------------------------------------------------------------");
        shop.printCarsByKilometerRange();
        System.out.println("-----------------------------------------------------------------------------------------");
        shop.printCarsByPriceRange();
    }
}
