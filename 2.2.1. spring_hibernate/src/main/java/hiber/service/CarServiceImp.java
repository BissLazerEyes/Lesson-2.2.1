package hiber.service;

import hiber.dao.CarsDao;
import hiber.model.Cars;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CarServiceImp implements CarService {
    @Autowired
    private CarsDao CarsDao;

    @Transactional
    @Override
    public void add(Cars cars) {
        CarsDao.add(cars);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Cars> listCars() {
        return CarsDao.listCars();
    }
}
