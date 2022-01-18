
package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarService {


    public List<Car> carList;

    {
        carList = new ArrayList<>();

        carList.add(new Car("Lada", 1, "red"));
        carList.add(new Car("Gaz", 2, "blue"));
        carList.add(new Car("Yaz", 3, "orange"));
        carList.add(new Car("Maz", 4, "green"));
        carList.add(new Car("Mazda", 5, "yellow"));
    }


    public List<Car> getCountCars(List<Car> carList, int count) {
        return carList.stream().limit(count).toList();
    }
}