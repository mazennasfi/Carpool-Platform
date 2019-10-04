package com.cov.entities;

import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import com.cov.entities.ProfilClient;
import com.cov.entities.ProfilConducteur;
import com.cov.entities.ProfilVoyageur;
import com.cov.entities.Role;


@Document(collection="Users")
public class User {
	@Id
	private String cin;
	private String nom;
	private String prenom;
	private String adresse;
	private ProfilClient profilClient;
	private ProfilVoyageur profilVoyageur;
	private ProfilConducteur profilConducteur;
	private String email;
	private String mdp;
	private Boolean activated;
	private Role role;
	
	public User(String cin, String nom, String prenom) {
		super();
		this.cin = cin;
		this.nom = nom;
		this.prenom = prenom;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public ProfilClient getProfilClient() {
		return profilClient;
	}
	public void setProfilClient(ProfilClient profilClient) {
		this.profilClient = profilClient;
	}
	public ProfilVoyageur getProfilVoyageur() {
		return profilVoyageur;
	}
	public void setProfilVoyageur(ProfilVoyageur profilVoyageur) {
		this.profilVoyageur = profilVoyageur;
	}
	public ProfilConducteur getProfilConducteur() {
		return profilConducteur;
	}
	public void setProfilConducteur(ProfilConducteur profilConducteur) {
		this.profilConducteur = profilConducteur;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	public Boolean getActivated() {
		return activated;
	}
	public void setActivated(Boolean activated) {
		this.activated = activated;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public User(String cin, String nom, String prenom, String adresse, com.cov.entities.ProfilClient profilClient,
			com.cov.entities.ProfilVoyageur profilVoyageur, com.cov.entities.ProfilConducteur profilConducteur,
			String email, String mdp, Boolean activated, com.cov.entities.Role role) {
		super();
		this.cin = cin;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.profilClient = profilClient;
		this.profilVoyageur = profilVoyageur;
		this.profilConducteur = profilConducteur;
		this.email = email;
		this.mdp = mdp;
		this.activated = activated;
		this.role = role;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
}
