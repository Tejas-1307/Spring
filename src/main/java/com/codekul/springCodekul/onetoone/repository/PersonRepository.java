package com.codekul.springCodekul.onetoone.repository;

import com.codekul.springCodekul.onetoone.entity.Person;
import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {


}
