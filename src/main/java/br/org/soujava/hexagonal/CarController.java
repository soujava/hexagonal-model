package br.org.soujava.hexagonal;

import java.util.List;

public class CarController {

    private Garage garage;
    public List<Car> cars(){
        return garage.findAll();
    }
}
