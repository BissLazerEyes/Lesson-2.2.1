package hiber.dao;

import hiber.model.Cars;

import java.util.List;

public interface CarsDao {
    void add(Cars cars);

    List<Cars> listCars();
}