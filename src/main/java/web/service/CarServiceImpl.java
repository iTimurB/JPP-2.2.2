package web.service;

import web.model.Car;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService{

    private List<Car> carList;
    {
        Car car1 = new Car("Audi", 7, "Red");
        Car car2 = new Car("BWM", 3, "Blue");
        Car car3 = new Car("Honda", 55, "Grey");
        Car car4 = new Car("Ferrari", 599, "Red");
        Car car5 = new Car("Porsche ", 911, "White");
        carList = Arrays.asList(car1, car2, car3, car4, car5);
    }

    @Override
    public List<Car> getCarCount(int count) {
        Collections.shuffle(carList);
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
