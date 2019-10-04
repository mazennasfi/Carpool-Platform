package com.cov.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cov.entities.Demande;
import com.cov.entities.User;
import com.cov.entities.Voyage;
import com.cov.metier.GererDemande;
import com.cov.repo.DemandeRepository;
import com.cov.repo.UserRepository;
import com.cov.repo.VoyageRepository;

@Controller
public class DemandeController {
	@Autowired
	DemandeRepository demandeRepository;
	@Autowired
	public VoyageRepository voyageRepository;
	@Autowired
	public GererDemande demandeService;
	@Autowired
	public UserRepository userRepository;
	
	@RequestMapping(value= "/demandes")
	public String displayDemandes(Model model)	
	{
		List<Demande> demandes=demandeRepository.findAll();
		model.addAttribute("listdemandes", demandes);

		return "demandes";
	}

	@RequestMapping(value="/accepterDemande/{id}")
	public String addUser(@PathVariable String id,Model model)
	{
		model.addAttribute("demande",demandeRepository.findById(id));
		model.addAttribute("voyageur",userRepository.findById(id));
		model.addAttribute("voyage",voyageRepository.findById(id));
		
		
		//demandeOptional=demandeRepository.findById(id);
		
		//demandeRepository.save(demande);
		
		return "demande";
	}
	@RequestMapping(value="/refuserDemande/{id}")
	public String deleteUser(@PathVariable String id,RedirectAttributes redir)
	{
		demandeRepository.deleteById(id);
		redir.addFlashAttribute("message", "demande refusée");
		
		
		return "redirect:/demandes";
		//demandeOptional=demandeRepository.findById(id);
		
		//demandeRepository.save(demande);
		
		
	}
	@RequestMapping(value="/saveDemande",method=RequestMethod.POST)
	public String saved(Demande demande,Voyage voyage,User voyageur)
	{
		demandeService.accepterVoyageur(demande,voyage,voyageur);
		
		return "redirect:/demandes";
	}
	@RequestMapping(value="/accepterDemande/saveDemande",method=RequestMethod.POST)
	public String saved1(Demande demande,Voyage voyage,User voyageur)
	{
		demandeService.accepterVoyageur(demande,voyage,voyageur);
		
		return "redirect:/demandes";
	}
	


}
