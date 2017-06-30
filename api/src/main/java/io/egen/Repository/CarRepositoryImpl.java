package io.egen.Repository;

import io.egen.entity.Alert;
import io.egen.entity.Car;
import io.egen.entity.Reading;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class CarRepositoryImpl implements CarRepository {

    @PersistenceContext
    private EntityManager em;

    public Car selectAll() {
        return null;
    }

    public Car load(Car car) {
        em.persist(car);
        return car;
    }

    public Reading readingUpdte(Reading reading) {
        {
            em.persist(reading.getTires());
            em.persist(reading);

        }
        return reading;

    }

    public Car findOne(String vin) {

        return em.find(Car.class,vin);
    }

    public Car update(Car car) {
      return  em.merge(car);
    }

    public Alert create(Alert alert) {
        em.persist(alert);
        return alert;
    }
}
