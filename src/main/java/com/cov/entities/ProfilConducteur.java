package com.cov.entities;

import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="profilsConducteurs")
public class ProfilConducteur {
	@Id
	private String id;

	public ProfilConducteur(String id) {
		super();
		this.id = id;
	}

	public ProfilConducteur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
	
	
	
}
