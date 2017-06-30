package io.egen.service;



import io.egen.Repository.CarRepository;
import io.egen.entity.Alert;
import io.egen.entity.Car;
import io.egen.entity.Reading;
import io.egen.entity.Tire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
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
//        Car existingVehicle = repository.findOne(reading.getVin());
//        Tire tire = reading.getTires();
//        List<Alert> alerts = new ArrayList<Alert>();
//        if(existingVehicle!=null){
//            if(reading.getEngineRpm() > existingVehicle.getRedlineRpm()){
//                Alert alert = new Alert();
//                alert.setRule("rule1");
//                alert.setPriority("high");
//                alerts.add(alert);
//                repository.create(alert);
//            }
//            if(reading.getFuelVolume() < (existingVehicle.getMaxFuelVolume()%10)){
//                Alert alert = new Alert();
//                alert.setRule("rule2");
//                alert.setPriority("medium");
//                alerts.add(alert);
//                repository.create(alert);
//            }
//            if((tire.getFrontLeft()<32 || tire.getFrontLeft()>36)||(tire.getFrontRight()<32 || tire.getFrontRight()>36)
//                    ||(tire.getRearLeft()<32 || tire.getRearLeft()>36)||(tire.getRearRight()<32 || tire.getRearLeft()>36)){
//
//                Alert alert = new Alert();
//                alert.setRule("rule3");
//                alert.setPriority("low");
//                alerts.add(alert);
//                repository.create(alert);
//            }
//            if(reading.isEngineCoolantLow() || reading.isCheckEngineLightOn()){
//                Alert alert = new Alert();
//                alert.setRule("rule4");
//                alert.setPriority("low");
//                alerts.add(alert);
//                repository.create(alert);
//            }
//        }
//        reading.setAlerts(alerts);
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
