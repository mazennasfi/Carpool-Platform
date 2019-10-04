package com.cov.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cov.entities.Localisation;

public interface LocalisationRepository extends MongoRepository<Localisation, String> {
}
