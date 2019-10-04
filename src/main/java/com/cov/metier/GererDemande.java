package com.cov.metier;

import java.awt.List;


import com.cov.entities.Demande;
import com.cov.entities.User;
import com.cov.entities.Voyage;

public interface GererDemande {
	public void accepterVoyageur(Demande demande,Voyage voyage,User voyageur);
	public void refuserVoyageur(Demande demande,Voyage voyage,User voyageur);

	
	public User ajouterVoyageur(User voyageur);
	public void ajouterDemande(String voyage);
	
	

}
