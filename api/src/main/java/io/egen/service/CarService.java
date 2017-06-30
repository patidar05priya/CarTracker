package io.egen.service;

import io.egen.entity.Car;
import io.egen.entity.Reading;

import java.util.List;

public interface CarService {
    List<Car> load(List<Car> cars);
    Reading readingUpdte(Reading reading);
    Car findOne(String vin);

    Car update(String vin, Car car);
}

