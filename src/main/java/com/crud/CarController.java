package com.crud;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class CarController {

    CarRepository repository;

    @GetMapping("/car")
    public List<Car>getAllcars(){
        return repository.findAll();
    }

    @ResponseBody
    @GetMapping("/car/{id}")
    public Car getCarById(@PathVariable Long id){
        return repository.findById(id).get();
    }
    @PostMapping("/car")
    public Car saveCar(@RequestBody Car car){
        return repository.save(car);
    }
    @DeleteMapping("/car/{id}")
    public void deleteCar(@PathVariable Long id){
        repository.deleteById(id);
    }
}
