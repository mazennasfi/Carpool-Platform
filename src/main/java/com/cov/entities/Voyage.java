package com.cov.entities;

import org.springframework.data.annotation.Id;



import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;


import java.util.Date;
import java.util.LinkedHashSet;


@Document(collection="Voyages")
public class Voyage {

   
	@Id
    private String id;

    private String etat;
    private Long prix;
    
    
    
    private LinkedHashSet<String> trajet;
    
    
    private String conducteur;
    
    
    private LinkedHashSet<String> demandes;
    
    
    private String dep;
    private String arr;
    
	private int nbrePlaceDep;
	
	@DateTimeFormat(pattern="yyyy-MM-dd'T'HH:mm")
	private Date depart;
	@DateTimeFormat(pattern="yyyy-MM-dd'T'HH:mm")
	private Date arrivee;
	private Long maxBagagePersonne;
	private Boolean fumeur;
	private Boolean radio;
	public Voyage() {
		super();

	
		
		// TODO Auto-generated constructor stub
	}
	
	public Voyage(String id, String etat, Long prix, LinkedHashSet<String> trajet, String conducteur,
			LinkedHashSet<String> demandes, String dep, String arr, int nbrePlaceDep, Date depart, Date arrivee,
			Long maxBagagePersonne, Boolean fumeur, Boolean radio) {
		super();
		this.id = id;
		this.etat = etat;
		this.prix = prix;
		this.trajet = trajet;
		this.conducteur = conducteur;
		this.demandes = demandes;
		this.dep = dep;
		this.arr = arr;
		this.nbrePlaceDep = nbrePlaceDep;
		this.depart = depart;
		this.arrivee = arrivee;
		this.maxBagagePersonne = maxBagagePersonne;
		this.fumeur = fumeur;
		this.radio = radio;
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

	public LinkedHashSet<String> getTrajet() {
		return trajet;
	}

	public void setTrajet(LinkedHashSet<String> trajet) {
		this.trajet = trajet;
	}

	public String getConducteur() {
		return conducteur;
	}

	public void setConducteur(String conducteur) {
		this.conducteur = conducteur;
	}

	public LinkedHashSet<String> getDemandes() {
		return demandes;
	}

	public void setDemandes(LinkedHashSet<String> demandes) {
		this.demandes = demandes;
	}

	public String getDep() {
		return dep;
	}

	public void setDep(String dep) {
		this.dep = dep;
	}

	public String getArr() {
		return arr;
	}

	public void setArr(String arr) {
		this.arr = arr;
	}

	public int getNbrePlaceDep() {
		return nbrePlaceDep;
	}

	public void setNbrePlaceDep(int nbrePlaceDep) {
		this.nbrePlaceDep = nbrePlaceDep;
	}

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
