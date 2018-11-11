package de.mschneid.jpahibernatebasics.model.repository;

import de.mschneid.jpahibernatebasics.model.Car;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@DataJpaTest
public class CustomerRepositoryTest {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CarRepository carRepository;


    @Test
    public void findAllCustomers() {
        assertEquals(2, customerRepository.findAll().size());
    }

    @Test
    public void findAllCarsForCustomer() {
        Page<Car> car = carRepository.findByCustomerId(1000L, Pageable.unpaged());
        assertEquals(car.getTotalElements(), 2);
        List<Car> content = car.getContent();
        content.forEach(c -> System.out.println(c.getModel()));
    }

}