package ro.fasttrackit.curs12.homework.extramile;

import java.util.*;

public class CarShop {
    private List<Car> carList = new ArrayList<>();

    public void addCar(Car car) {
        this.carList.add(car);
    }

    public List<Car> getCarList() {
        return carList;
    }

    private Set<String> carNames() {
        Set<String> carNames = new HashSet<>();
        for (Car car : this.carList) {
            carNames.add(car.getName());
        }
        return carNames;
    }

    public Map<String, Integer> numberOfCarsByName() {
        Map<String, Integer> result = new HashMap<>();
        Set<String> carNames = carNames();
        for (String name : carNames) {
            int count = 0;
            for (Car car : this.carList) {
                if (car.getName().toLowerCase().equals(name.toLowerCase())) {
                    count++;
                }
                result.put(name, count);
            }
        }
        return result;
    }

    public Map<String, List<Integer>> carsByNameAndKilometers() {
        Set<String> carNames = carNames();
        Map<String, List<Integer>> result = new HashMap<>();
        for (String name : carNames) {
            List<Integer> kilometers = new ArrayList<>();
            for (Car car : this.carList) {
                if (car.getName().toLowerCase().equals(name.toLowerCase())) {
                    kilometers.add(car.getKilometers());
                }
                result.put(name, kilometers);
            }
        }
        return result;
    }

    public Map<String, List<Car>> carsByKilometerRange() {
        Map<String, List<Car>> result = new HashMap<>();
        List<Car> range1 = new ArrayList<>();
        List<Car> range2 = new ArrayList<>();
        List<Car> range3 = new ArrayList<>();
        List<Car> range4 = new ArrayList<>();
        List<Car> range5 = new ArrayList<>();
        List<Car> range6 = new ArrayList<>();
        List<Car> range7 = new ArrayList<>();
        for (Car car : this.carList) {
            if (car.getKilometers() < 10000) {
                range1.add(car);
                result.put("Range: 0 --- < 10.000 ", range1);
            } else if (car.getKilometers() < 50000) {
                range2.add(car);
                result.put("Range: 10.000 --- < 50.000 ", range2);
            } else if (car.getKilometers() < 100000) {
                range3.add(car);
                result.put("Range: 50.000 --- < 100.000 ", range3);
            } else if (car.getKilometers() < 200000) {
                range4.add(car);
                result.put("Range: 100.000 --- < 200.000 ", range4);
            } else if (car.getKilometers() < 350000) {
                range5.add(car);
                result.put("Range: 200.000 --- < 350.000 ", range5);
            } else if (car.getKilometers() < 500000) {
                range6.add(car);
                result.put("Range: 350.000 --- < 500.000 ", range6);
            } else {
                range7.add(car);
                result.put("Range: > 500.000 ", range7);
            }
        }
        return result;
    }

    public Map<String, List<Car>> carsByPriceRange() {
        Map<String, List<Car>> result = new HashMap<>();
        List<Car> range1 = new ArrayList<>();
        List<Car> range2 = new ArrayList<>();
        List<Car> range3 = new ArrayList<>();
        List<Car> range4 = new ArrayList<>();
        List<Car> range5 = new ArrayList<>();
        for (Car car : this.carList) {
            if (car.getPrice() < 10000) {
                range1.add(car);
                result.put("Price: < 10.000 ", range1);
            } else if (car.getPrice() < 20000) {
                range2.add(car);
                result.put("Price: 10.000 --- < 20.000 ", range2);
            } else if (car.getPrice() < 50000) {
                range3.add(car);
                result.put("Price: 20.000 --- < 50.000 ", range3);
            } else if (car.getPrice() < 100000) {
                range4.add(car);
                result.put("Price: 50.000 --- < 100.000 ", range4);
            } else {
                range5.add(car);
                result.put("Price: > 100.000 ", range5);
            }
        }
        return result;
    }

    public void printCarsByKilometerRange() {
        Map<String, List<Car>> map = carsByKilometerRange();
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }

    public void printCarsByPriceRange() {
        Map<String, List<Car>> map = carsByPriceRange();
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }

    @Override
    public String toString() {
        return "CarShop{" +
                "carList=" + carList +
                '}';
    }
}
