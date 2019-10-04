package com.cov.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="profilsClients")
public class ProfilClient {
	@Id
	private String id;

	public ProfilClient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProfilClient(String id) {
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
