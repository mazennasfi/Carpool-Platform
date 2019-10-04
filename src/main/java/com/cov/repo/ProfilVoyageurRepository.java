package com.cov.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cov.entities.ProfilVoyageur;

public interface ProfilVoyageurRepository extends MongoRepository<ProfilVoyageur, String> {
}
