package com.cov.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cov.entities.ProfilConducteur;

public interface ProfilConducteurRepository extends MongoRepository<ProfilConducteur, String> {
}
