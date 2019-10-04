package com.cov.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cov.entities.ProfilClient;

public interface ProfilClientRepository extends MongoRepository<ProfilClient, String> {
}
