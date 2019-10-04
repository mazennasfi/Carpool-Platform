package com.cov.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cov.entities.Demande;
import com.cov.entities.User;

public interface UserRepository extends MongoRepository<User, String> {
	@Query("{ 'username' : ?0 }")
	public User userParUsername(@Param(value="username") String username);
	
	

}
