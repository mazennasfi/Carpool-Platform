package com.cov.entities;

import org.springframework.data.annotation.Id;



import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="demandes")
public class Demande {

    @Id
    private String id;
    private String voyage;
    
    
    private String etat;
   
    private String voyageur;
    
   
    

	public Demande() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Demande(String id, String voyage, String etat, String voyageur) {
		super();
		this.id = id;
		this.voyage = voyage;
		this.etat = etat;
		this.voyageur = voyageur;
	}




	public String getId() {
		return id;
	}




	public void setId(String id) {
		this.id = id;
	}




	public String getVoyage() {
		return voyage;
	}




	public void setVoyage(String voyage) {
		this.voyage = voyage;
	}




	public String getEtat() {
		return etat;
	}




	public void setEtat(String etat) {
		this.etat = etat;
	}




	public String getVoyageur() {
		return voyageur;
	}




	public void setVoyageur(String voyageur) {
		this.voyageur = voyageur;
	}

	
	
}
