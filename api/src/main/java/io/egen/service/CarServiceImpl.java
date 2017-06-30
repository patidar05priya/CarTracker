package io.egen.service;



import io.egen.Repository.CarRepository;
import io.egen.entity.Car;
import io.egen.entity.Reading;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    CarRepository repository;

    @Transactional
    public List<Car> load(List<Car> cars)
    {
        for(Car c: cars)
        {
            Car existing = repository.findOne(c.getVin());
            if(existing!=null)
            {
                System.out.println("VIN exists");
                repository.update(c);
            }else{
                repository.load(c);
            }
        }
        return cars;
    }
    @Transactional
    public Reading readingUpdte(Reading reading)
    {
        return repository.readingUpdte(reading);
    }

    public Car findOne(String vin) {
        return null;
    }


    @Transactional
    public Car update(String vin, Car car) {
        return null;
    }


}
