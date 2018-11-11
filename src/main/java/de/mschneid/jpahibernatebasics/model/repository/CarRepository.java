package de.mschneid.jpahibernatebasics.model.repository;

import de.mschneid.jpahibernatebasics.model.Car;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {

    Page<Car> findByCustomerId(Long customerId, Pageable pageable);

}
