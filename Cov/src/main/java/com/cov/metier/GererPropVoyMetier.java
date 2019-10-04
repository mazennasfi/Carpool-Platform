package com.cov.metier;

import java.util.List;

import com.cov.entities.Voyage;

public interface GererPropVoyMetier {
	public Voyage ajouterTrajet(Voyage voyage);
	public void annulerTrajet(String id);
	public List<Voyage> listPropositions();
	public Voyage majTrajet(Voyage voyage);

	
	

}
