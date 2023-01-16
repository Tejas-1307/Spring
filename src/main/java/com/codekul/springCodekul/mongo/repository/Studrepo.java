package com.codekul.springCodekul.mongo.repository;

import com.codekul.springCodekul.mongo.modal.Students;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface Studrepo extends MongoRepository<Students,Integer> {
}
