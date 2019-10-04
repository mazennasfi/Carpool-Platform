package com.cov.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cov.entities.Role;

public interface RoleRepository extends MongoRepository<Role, String> {
}
