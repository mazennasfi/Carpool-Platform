package com.cov.metier;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cov.entities.Voyage;
import com.cov.repo.VoyageRepository;

@Service
public class GererPropVoyMetierImpl implements GererPropVoyMetier {

	@Autowired
	private VoyageRepository voyageRepository;
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
	

}
