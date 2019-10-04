package com.cov.web;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cov.entities.Localisation;
import com.cov.entities.User;
import com.cov.entities.Voyage;
import com.cov.repo.LocalisationRepository;
import com.cov.repo.UserRepository;
import com.cov.repo.VoyageRepository;

@Controller
public class VoyageController {
	
	@Autowired
	public VoyageRepository voyageRepository;
	@Autowired
	public LocalisationRepository localisationRepository;
	

	
	@RequestMapping(value= "/voyages")
	public String listerVoyages(Model model)	
	{
		List<Voyage> voyages=voyageRepository.findAll();
		model.addAttribute("listvoyages", voyages);
		return "voyages";
	}
	
	@RequestMapping(value="/voyage",method=RequestMethod.GET)
	public String ajouterVoyage(Model model)
	{
		Voyage voyage=new Voyage();
	
		/*for (int i = 1; i <= 2; i++) {
	        voyage.addLocalisation(new Localisation());
	    }*/
		
		model.addAttribute("voyage",voyage);
		
		
		
		return "voyage";
	}
	
	@RequestMapping(value="/SaveVoyage",method=RequestMethod.POST)
	public String saveVoyage(Voyage voy)
	{
		voy.setEtat("accepter");
		voyageRepository.save(voy);
		
		return "redirect:/voyages";
	}
	@RequestMapping(value="supprimerVoyage/{id}")
	public String deleteVoyage(@PathVariable String id,RedirectAttributes redir)
	{
		voyageRepository.deleteById(id);
		redir.addFlashAttribute("message", "voyage supprimé");
		return "redirect:/voyages";
	}
	@RequestMapping(value="modifierVoyage/{id}")
	public String editerVoyage(@PathVariable String id,Model model)
	{
		model.addAttribute("voyage",voyageRepository.findById(id));
		
	
		return "voyage";
	}
	@RequestMapping(value="/modifierVoyage/SaveVoyage",method=RequestMethod.POST)
	public String saveVoyage1(Voyage voy)
	{
		voy.setEtat("accepter");
		voyageRepository.save(voy);
		
		return "redirect:/voyages";
	}
	

}
