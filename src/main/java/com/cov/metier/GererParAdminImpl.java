package com.cov.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cov.entities.Demande;
import com.cov.entities.User;
import com.cov.entities.Voyage;
import com.cov.repo.DemandeRepository;
import com.cov.repo.UserRepository;
import com.cov.repo.VoyageRepository;

@Service
public class GererParAdminImpl implements GererParAdmin {
	
	@Autowired
	private VoyageRepository voyageRepository;
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private DemandeRepository demandeRepository;
	
	public void bannirVoyageur(String username)
	{
		
		User client=userRepository.userParUsername(username);
		userRepository.delete(client);
		List<Demande> demandes=demandeRepository.demandeParUser(username);
		if(demandes!=null)
		{
			for(int i=0;i<demandes.size();i++)
			{
				demandeRepository.delete(demandes.get(i));
			}
		}
		List<Voyage> voyages=voyageRepository.voyageParUser2(username);
		if(voyages!=null) {
			for(int i=0;i<voyages.size();i++)
			{
				voyageRepository.delete(voyages.get(i));
			}
			
			
		}
		
		
	}

}
