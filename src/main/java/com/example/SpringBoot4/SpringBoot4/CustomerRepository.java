package com.example.SpringBoot4.SpringBoot4;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
   
}
