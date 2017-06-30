package io.egen.Repository;


import io.egen.entity.Alert;
import io.egen.entity.Car;
import io.egen.entity.Reading;

public interface CarRepository {
    Car selectAll();
    Car load(Car car);
    Reading readingUpdte(Reading reading);
    Car findOne(String vin);
    Car update(Car car);
    Alert create(Alert alert);
}
