package com.cov.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="etatdemandes")
public enum EtatDemande {
	 ACCEPTEE("ACCEPTEE"), ENVOYEE("ENVOYEE"),REFUSEE("REFUSEE");
	@Id
	private String etatDemande;

	public String getEtatDemande() {
		return etatDemande;
	}

	public void setEtatDemande(String etatDemande) {
		this.etatDemande = etatDemande;
	}

	EtatDemande(String etatDemande) {
		this.etatDemande = etatDemande;
	}

	
	

}
