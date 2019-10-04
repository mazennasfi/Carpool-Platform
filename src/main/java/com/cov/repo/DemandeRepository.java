package com.cov.repo;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cov.entities.Demande;
import com.cov.entities.User;


public interface DemandeRepository extends MongoRepository<Demande, String> {
	@Query("{ 'voyageur' : ?0 }")
	public List<Demande> demandeParUser(@Param(value="username") String username);
	@Query("{ 'voyage' : ?0 }")
	public Demande demandeParVoyage(@Param(value="voyage") String voyage);
	@Query("{ 'id' : ?0 }")
	public Demande demandeParId(@Param(value="id") String id);
}
