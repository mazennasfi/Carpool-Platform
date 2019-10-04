package com.cov.repo;


import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cov.entities.Demande;
import com.cov.entities.Voyage;

public interface VoyageRepository extends MongoRepository<Voyage, String> {
	@Query("{ 'conducteur' : ?0 }")
	public Page<Voyage> voyageParUser(@Param(value="username") String username,Pageable page);
	@Query("{ 'conducteur' : ?0 }")
	public List<Voyage> voyageParUser2(@Param(value="username") String username);
	@Query("{ 'dep' : ?0 }")
	public List<Voyage> voyageParDepart(@Param(value="depart") String depart);
	
}
