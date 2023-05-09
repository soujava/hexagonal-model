package br.org.soujava.layers;

import org.jmolecules.ddd.annotation.Entity;
import org.jmolecules.ddd.annotation.Identity;

import java.time.Year;
import java.util.Collections;
import java.util.List;

@Entity
class Car extends ActiveRecord {

    @Identity
    public String plate;

    public String model;

    public Year year;

    public Car(String plate, String model, Year year) {
        this.plate = plate;
        this.model = model;
        this.year = year;
    }

    public String getPlate() {
        return plate;
    }

    public String getModel() {
        return model;
    }

    public Year getYear() {
        return year;
    }

    public static List<Car> findAll() {
        return Collections.emptyList();
    }
}
