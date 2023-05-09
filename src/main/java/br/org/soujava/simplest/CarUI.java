package br.org.soujava.simplest;

import java.util.List;

class CarUI {

    public List<Car> cars() {
        return Car.findAll();
    }

    public void save(Car car) {
        car.insert();
    }
}
