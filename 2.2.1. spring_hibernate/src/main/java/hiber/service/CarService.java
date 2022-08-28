package hiber.service;

import hiber.model.Cars;

import java.util.List;

public interface CarService {
    void add(Cars cars);
    List<Cars> listCars();
}
