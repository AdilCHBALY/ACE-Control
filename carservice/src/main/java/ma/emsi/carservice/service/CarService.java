package ma.emsi.carservice.service;

import ma.emsi.carservice.beans.Car;
import ma.emsi.carservice.model.CarResponse;

import java.util.List;

public interface CarService {
    List<CarResponse> findAll();
    CarResponse findById(Long id) throws Exception;
    void save(CarResponse car);
    void delete(Long id) throws Exception;

    void update(CarResponse carResponse, Long id) throws Exception;
}
