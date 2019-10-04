package com.cov.metier;

import java.util.List;

import org.springframework.data.domain.Page;

import com.cov.entities.User;
import com.cov.entities.Voyage;

public interface GererPropVoyMetier {
	public User ajouterVoyage(Voyage voyage);
	public Voyage ajouterTrajet(Voyage voyage);
	public void annulerTrajet(String id);
	public List<Voyage> listPropositions();
	public Voyage majTrajet(Voyage voyage);
	//public Page<Voyage> listeVoyages(String username,int page,int size);
	
	public User ajouterConducteur(User conducteur);

	
	
	

}
