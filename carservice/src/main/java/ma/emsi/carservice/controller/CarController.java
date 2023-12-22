package ma.emsi.carservice.controller;


import ma.emsi.carservice.beans.Car;
import ma.emsi.carservice.beans.Client;
import ma.emsi.carservice.model.CarResponse;
import ma.emsi.carservice.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@CrossOrigin(origins = {"http://localhost:3000/","http://localhost:4200/"})
@RequestMapping("api/car")
public class CarController {
    @Autowired
    private CarService carService;
    @GetMapping
    public List<CarResponse> findAll(){
        return carService.findAll();
    }

    @GetMapping("/{id}")
    public CarResponse findById(@PathVariable Long id) throws Exception {return carService.findById(id);}

    @PostMapping
    public void add(@RequestBody CarResponse car){carService.save(car);}

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) throws Exception {carService.delete(id);}

    @PutMapping("/{id}")
    public void update(@PathVariable Long id,@RequestBody CarResponse carResponse) throws Exception {carService.update(carResponse,id);}
}
