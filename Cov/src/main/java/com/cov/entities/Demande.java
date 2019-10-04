package com.cov.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection="demandes")
public class Demande {

    @Id
    private String id;
    private String etat;

    private List<Voyage> voyages;
    private List<User> users;

   

    

	public Demande(String id, String etat, List<Voyage> voyages, List<User> users) {
		super();
		this.id = id;
		this.etat = etat;
		this.voyages = voyages;
		this.users = users;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Demande() {
		super();
		// TODO Auto-generated constructor stub
	}

	

   

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public List<Voyage> getVoyages() {
        return voyages;
    }

    public void setVoyages(List<Voyage> voyages) {
        this.voyages = voyages;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

}
