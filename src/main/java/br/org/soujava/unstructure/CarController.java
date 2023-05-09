package br.org.soujava.unstructure;

import java.util.List;

class CarController {

    public List<Car> cars() {
        return Car.findAll();
    }

    public void save(Car car) {
        car.insert();
    }
}
