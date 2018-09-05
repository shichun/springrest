package com.peter.repository;

import org.springframework.data.repository.CrudRepository;

import com.peter.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer,Long>{}
