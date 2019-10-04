package com.cov.metier;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.cov.entities.ProfilConducteur;
import com.cov.entities.Role;
import com.cov.entities.User;
import com.cov.entities.Voyage;
import com.cov.repo.UserRepository;
import com.cov.repo.VoyageRepository;

@Service
public class GererPropVoyMetierImpl implements GererPropVoyMetier {

	@Autowired
	private VoyageRepository voyageRepository;
	@Autowired
	private UserRepository userRepository;
	@Override
	public Voyage ajouterTrajet(Voyage voyage) {
		return voyageRepository.save(voyage);
	}

	@Override
	public void annulerTrajet(String id) {


		voyageRepository.deleteById(id);
		
	}

	@Override
	public List<Voyage> listPropositions() {
		return voyageRepository.findAll();
	}

	@Override
	public Voyage majTrajet(Voyage voyage) {
		String id=voyage.getId();
		Optional<Voyage> voyageOptional= voyageRepository.findById(id);
		if(!voyageOptional.isPresent())
		{
			return null;
		}
		voyage.setId(id);
		
		return voyageRepository.save(voyage);
		
		
		
		
	}

/*	public User ajouterConducteur(User conducteur)
	{
		ProfilConducteur profil=new ProfilConducteur();
		
		Role client=Role.CLIENT;
		client.setRole("client");
		
		conducteur.setProfilConducteur(profil);
		conducteur.setRole(client);
		userRepository.save(conducteur);
		return conducteur;
	}*/
/*	@Override
	public Page<Voyage> listeVoyages(String username,int page,int size)
	{
		return voyageRepository.voyageParUser(username, new PageRequest(page, size));
		
	}
	
*/
	@Override
	public User ajouterConducteur(User conducteur)
	{
		
		conducteur.setRole("Conducteur");
		userRepository.save(conducteur);
		
		
		
		return conducteur;
	}
	
	@Override
	public User ajouterVoyage(Voyage voyage)
	{
		
			
		
		LinkedHashSet<String> voyages=new LinkedHashSet<>();
		
		String username=voyage.getConducteur();
		User conducteur=userRepository.userParUsername(username);
		String idVoyage=voyage.getId();
		voyages=conducteur.getOffres();
		voyages.add(idVoyage);
		
		conducteur.setOffres(voyages);
		userRepository.save(conducteur);
		
		
		
		return conducteur;
		
		
	}
	
	
	
	
	
	
	
}
