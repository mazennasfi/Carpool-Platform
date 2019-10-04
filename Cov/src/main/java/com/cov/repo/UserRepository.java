package com.cov.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cov.entities.User;

public interface UserRepository extends MongoRepository<User, String> {

}
