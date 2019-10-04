package com.cov.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cov.entities.Demande;

public interface DemandeRepository extends MongoRepository<Demande, String> {
}
