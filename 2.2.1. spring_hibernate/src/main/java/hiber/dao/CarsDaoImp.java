package hiber.dao;

import hiber.model.Cars;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class CarsDaoImp implements CarsDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void add(Cars cars) {
        sessionFactory.getCurrentSession().save(cars);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Cars> listCars() {
        TypedQuery<Cars> query = sessionFactory.getCurrentSession().createQuery("from Cars");
        return query.getResultList();
    }
}