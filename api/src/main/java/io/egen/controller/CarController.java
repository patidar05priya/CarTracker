package io.egen.controller;

import io.egen.entity.Car;
import io.egen.entity.Reading;
import io.egen.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
@ResponseBody

public class CarController {

    @Autowired
    CarService service;





    @RequestMapping(method = RequestMethod.POST,value="/readings", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @CrossOrigin
    public void update(@RequestBody Reading reading)
    {
        service.readingUpdte(reading);

    }


    @RequestMapping(method = RequestMethod.PUT,value = "/vehicles",consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @CrossOrigin
    public void load(@RequestBody List<Car> cars) {
        service.load(cars);
    }
}
