package com.anuj.springrest.sample.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.anuj.springrest.sample.entity.Address;
public interface AddressRepository extends CrudRepository<Address, Integer> {

}
