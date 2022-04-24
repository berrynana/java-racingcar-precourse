package domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Cars {
    private List<Car> cars;

    public Cars(String[] names) {
        List<Car> newCars = new ArrayList<>();
        for (String name : names) {
            Car car = new Car();
            car.setName(name);
        }

        validateDuplicatedName(newCars);
        this.cars = newCars;
    }

    public Cars(List<Car> cars) {
        validateDuplicatedName(cars);
        this.cars = cars;
    }

    private void validateDuplicatedName(List<Car> cars) {
        Set<Car> uniqueNameCars = new HashSet<>(cars);
        if (!isEqualLength(uniqueNameCars.size())) {
            throw new IllegalArgumentException();
        }
    }

    private boolean isEqualLength(Integer length) {
        return cars.size() == length;
    }
}
