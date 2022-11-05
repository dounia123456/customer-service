package org.sid.customerservice;

import org.sid.customerservice.entities.Customer;
import org.sid.customerservice.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}
@Bean  // sans cette anotation les donnees ne partent pas vers la base de donnees
	CommandLineRunner start(CustomerRepository customerRepository){
		return args -> {
			customerRepository.save(new Customer(null,"dounia","dou@gmail.com"));
			customerRepository.save(new Customer(null,"mohamed","mo@gmail.com"));
			customerRepository.save(new Customer(null,"kawtar","ka@gmail.com"));
			customerRepository.save(new Customer(null,"amine","am@gmail.com"));
			customerRepository.findAll().forEach(c->{
				System.out.println(c.toString());
			});


		};
	}


}



//{}