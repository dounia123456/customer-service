package org.sid.customerservice.repository;

import org.sid.customerservice.entities.Customer;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;
@SpringBootApplication
public interface CustomerRepository  extends JpaRepository<Customer , Long> {

}


//on a terminé le microservice pour customer