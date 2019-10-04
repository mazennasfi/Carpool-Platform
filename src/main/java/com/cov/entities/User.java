package com.cov.entities;




import java.util.LinkedHashSet;
import java.util.LinkedList;

import org.springframework.data.annotation.Id;


import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="Users")
public class User {
	@Id
	
	private String username;
	
	
    private String email;
	
	
    private String password;
	
	
	private String profilClient;
	
	
	private String profilVoyageur;
	
	
	private String profilConducteur;
	
	
	
	 
	 private String role;
	 
	 
	 private LinkedHashSet<String> demandes;
	 
	 private LinkedHashSet<String> offres;
	 
	
	public User() {
		super();
		
		// TODO Auto-generated constructor stub
	}


	


	





	public String getRole() {
		return role;
	}











	public void setRole(String role) {
		this.role = role;
	}











	public User(String username, String email, String password, String profilClient, String profilVoyageur,
			String profilConducteur, String role, LinkedHashSet<String> demandes,
			LinkedHashSet<String> offres) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
		this.profilClient = profilClient;
		this.profilVoyageur = profilVoyageur;
		this.profilConducteur = profilConducteur;
		this.role = role;
		this.demandes = demandes;
		this.offres = offres;
	}



	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getProfilClient() {
		return profilClient;
	}


	public void setProfilClient(String profilClient) {
		this.profilClient = profilClient;
	}


	public String getProfilVoyageur() {
		return profilVoyageur;
	}


	public void setProfilVoyageur(String profilVoyageur) {
		this.profilVoyageur = profilVoyageur;
	}


	public String getProfilConducteur() {
		return profilConducteur;
	}


	public void setProfilConducteur(String profilConducteur) {
		this.profilConducteur = profilConducteur;
	}


	


	public LinkedHashSet<String> getDemandes() {
		return demandes;
	}


	public void setDemandes(LinkedHashSet<String> demandes) {
		this.demandes = demandes;
	}


	public LinkedHashSet<String> getOffres() {
		return offres;
	}


	public void setOffres(LinkedHashSet<String> offres) {
		this.offres = offres;
	}
	

}
