package br.org.soujava.mvc;

import java.util.List;

public class CarController {

    public List<Car> cars(){
        return Car.findAll();
    }
}
