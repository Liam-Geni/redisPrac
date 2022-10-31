package com.sparta.redisprac.repository;

import com.sparta.redisprac.model.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRedisRepository extends CrudRepository<Person, String> {

}
