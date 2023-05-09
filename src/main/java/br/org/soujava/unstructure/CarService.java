package br.org.soujava.unstructure;

import org.jmolecules.ddd.annotation.Service;

import java.util.List;

@Service
class CarService {

    public List<Car> cars() {
        return Car.findAll();
    }

    public void save(Car car) {
        car.insert();
    }
}
