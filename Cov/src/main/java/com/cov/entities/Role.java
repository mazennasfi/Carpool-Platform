package com.cov.entities;

import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="roles")
public enum Role {

    ADMIN("ADMIN"), CLIENT("CLIENT");

    @Id
    private String role;

    Role(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

}
