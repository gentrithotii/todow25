package com.gentrit.todow25.repository;

import com.gentrit.todow25.entity.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository  extends CrudRepository<Person, Long> {
}
