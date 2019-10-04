package com.cov.entities;

import org.springframework.data.annotation.Id;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Timestamp;
import java.util.Date;
import java.util.List;

public class Voyage {

    public Voyage() {
		super();
		
		// TODO Auto-generated constructor stub
	}

	@Id
    private String id;

    private String etat;
    private Long prix;
    private List<Localisation> trajet;
    private User conducteur;
	private int nbrePlaceDep;
	private int nbrePlaceRest;
	@DateTimeFormat(pattern="yyyy-MM-dd'T'HH:mm")
	private Date depart;
	@DateTimeFormat(pattern="yyyy-MM-dd'T'HH:mm")
	private Date arrivee;
	private Long maxBagagePersonne;
	private Boolean fumeur;
	private Boolean radio;
	
	



	
	public Date getDepart() {
		return depart;
	}


	public void setDepart(Date depart) {
		this.depart = depart;
	}


	public Date getArrivee() {
		return arrivee;
	}


	public void setArrivee(Date arrivee) {
		this.arrivee = arrivee;
	}


	public Voyage(String id, String etat, Long prix, List<Localisation> trajet, User conducteur, int nbrePlaceDep,
			int nbrePlaceRest, Date depart, Date arrivee, Long maxBagagePersonne, Boolean fumeur, Boolean radio) {
		super();
		this.id = id;
		this.etat = etat;
		this.prix = prix;
		this.trajet = trajet;
		this.conducteur = conducteur;
		this.nbrePlaceDep = nbrePlaceDep;
		this.nbrePlaceRest = nbrePlaceRest;
		this.depart = depart;
		this.arrivee = arrivee;
		this.maxBagagePersonne = maxBagagePersonne;
		this.fumeur = fumeur;
		this.radio = radio;
	}
	public void addLocalisation(Localisation loc) {
        this.trajet.add(loc);
        
    }


	public Voyage(String id, String etat) {
		super();
		this.id = id;
		this.etat = etat;
	}
	

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public Long getPrix() {
		return prix;
	}
	public void setPrix(Long prix) {
		this.prix = prix;
	}
	public List<Localisation> getTrajet() {
		return trajet;
	}
	public void setTrajet(List<Localisation> trajet) {
		this.trajet = trajet;
	}
	public User getConducteur() {
		return conducteur;
	}
	public void setConducteur(User conducteur) {
		this.conducteur = conducteur;
	}
	public int getNbrePlaceDep() {
		return nbrePlaceDep;
	}
	public void setNbrePlaceDep(int nbrePlaceDep) {
		this.nbrePlaceDep = nbrePlaceDep;
	}
	public int getNbrePlaceRest() {
		return nbrePlaceRest;
	}
	public void setNbrePlaceRest(int nbrePlaceRest) {
		this.nbrePlaceRest = nbrePlaceRest;
	}

	public Long getMaxBagagePersonne() {
		return maxBagagePersonne;
	}
	public void setMaxBagagePersonne(Long maxBagagePersonne) {
		this.maxBagagePersonne = maxBagagePersonne;
	}
	public Boolean getFumeur() {
		return fumeur;
	}
	public void setFumeur(Boolean fumeur) {
		this.fumeur = fumeur;
	}
	public Boolean getRadio() {
		return radio;
	}
	public void setRadio(Boolean radio) {
		this.radio = radio;
	}
	
	
    
}
