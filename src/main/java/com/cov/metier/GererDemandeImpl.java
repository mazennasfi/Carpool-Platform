package com.cov.metier;

import java.util.Iterator;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cov.entities.Demande;

import com.cov.entities.User;
import com.cov.entities.Voyage;
import com.cov.repo.DemandeRepository;
import com.cov.repo.UserRepository;
import com.cov.repo.VoyageRepository;


@Service
public class GererDemandeImpl implements GererDemande{

	@Autowired
	private DemandeRepository demandeRepository;
	@Autowired
	private VoyageRepository voyageRepository;
	@Autowired
	private UserRepository userRepository;
	
	

	@Override
	public void accepterVoyageur(Demande demande,Voyage voyage,User voyageur) {
		
		
		/*demande.setEtat("acceptee");
		demandeRepository.save(demande);
		voyage.setNbrePlaceRest(voyage.getNbrePlaceRest()-1);
		voyageRepository.save(voyage);
		voyageur.setActivated(true);
		userRepository.save(voyageur);*/
	}
	

		/*Optional<Demande> demandeOptional=demandeRepository.findById(demande.getId());
		if(demandeOptional.isPresent())
		{
			if(voyage.getNbrePlaceRest()>0)
			{
				
				boolean x=true;
				Iterator<User> it=demande.getUsers().iterator();
				while(it.hasNext())
				{
					User voy=it.next();
					if(voy.getCin()==idVoyageur)
					{
						x=false;					
					}
				x=true;
				
				
				}
				if(x==true)
				{
					voyage.setNbrePlaceRest(voyage.getNbrePlaceRest()-1);
					demande.setEtat("accepted");
					demande.getVoyages().add(voyage);
					demande.getUsers().add(voyageur);
					
					return demandeRepository.save(demande);
					
				}
				
			}
			
		}
		}return null;*/
		

	@Override
	public void refuserVoyageur(Demande demande,Voyage voyage,User voyageur) {
	/*	demande.setEtat("refusee");
		demandeRepository.save(demande);
		voyage.setNbrePlaceRest(voyage.getNbrePlaceRest()+1);
		voyageRepository.save(voyage);
		voyageur.setActivated(false);
		userRepository.save(voyageur);
		*/
		
			/*String demandeId;
			demandeId=demande.getId();
			
			Optional<Demande> demandeOptional=demandeRepository.findById(demande.getId());
			if(demandeOptional.isPresent())
			{
				Iterator<User> it=demande.getUsers().iterator();
				while(it.hasNext())
				{
					User voy=it.next();
					if(voy.getCin()==idVoyageur)
					{
						it.remove();
						voyage.setNbrePlaceRest(voyage.getNbrePlaceRest()+1);
						
						demande.setEtat("refused");
						demandeRepository.deleteById(demandeId);
					}
				}
			}
			

		*/
		
	}
	@Override
	public User ajouterVoyageur(User voyageur)
	{
		
		voyageur.setRole("Voyageur");
		userRepository.save(voyageur);
		
		
		
		return voyageur;
	}	
	@Override
	public void ajouterDemande(String voyage)
	{
		
		Demande demande=new Demande();
		demande.setVoyage(voyage);
		
		demande.setEtat("Envoyee");
		demandeRepository.save(demande);
		
		
		
		
	}


}
	


