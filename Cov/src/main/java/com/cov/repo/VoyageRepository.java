package com.cov.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cov.entities.Localisation;
import com.cov.entities.Voyage;

public interface VoyageRepository extends MongoRepository<Voyage, String> {

	
}
