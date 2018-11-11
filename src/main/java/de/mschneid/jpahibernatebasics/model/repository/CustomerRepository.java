package de.mschneid.jpahibernatebasics.model.repository;

import de.mschneid.jpahibernatebasics.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
