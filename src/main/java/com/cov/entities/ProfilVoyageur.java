package com.cov.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="profilsVoyageurs")
public class ProfilVoyageur {
	@Id
	private String id;

	public ProfilVoyageur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProfilVoyageur(String id) {
		super();
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
