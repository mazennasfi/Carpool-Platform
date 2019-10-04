package com.cov.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cov.entities.Localisation;
import com.cov.entities.User;
import com.cov.entities.Voyage;
import com.cov.metier.GererPropVoyMetier;
import com.cov.repo.LocalisationRepository;
import com.cov.repo.UserRepository;
import com.cov.repo.VoyageRepository;

@Controller
public class ConducteurController {
	
	@Autowired
	public GererPropVoyMetier propService;
	@Autowired
	public UserRepository userRepository;
	@Autowired
	public VoyageRepository voyageRepository;
	@Autowired
	public LocalisationRepository localisationRepository;
	
	
	@RequestMapping(value="/conducteur",method=RequestMethod.GET)
	public String home()
	{
		return "conducteur";
	}

	
	
	@RequestMapping(value="conducteur/supprimerVoyage/{id}")
	public String deleteVoyage(@PathVariable String id,RedirectAttributes redir)
	{
		voyageRepository.deleteById(id);
		redir.addFlashAttribute("message", "voyage supprimé");
		return "redirect:/conducteur/voyages";
	}
	@RequestMapping(value="conducteur/modifierVoyage/{id}")
	public String editerVoyage(@PathVariable String id,Model model)
	{
		model.addAttribute("voyage",voyageRepository.findById(id));
		
	
		return "voyage";
	}
	
	@RequestMapping(value="/conducteur/voyage/SaveVoyage",method=RequestMethod.POST)
	public String save1(Voyage voy)
	{
		
		voyageRepository.save(voy);
		
		
		return "redirect:/conducteur/voyages";
	}

	
	@RequestMapping(value= "/conducteur/voyageurs")
	public String listerVoyageurs(Model model)	
	{
		
		List<User> users=userRepository.findAll();
		model.addAttribute("listusers", users);
		return "users";
	}
	
	@RequestMapping(value="/conducteur/creer",method=RequestMethod.GET)
	public String ajouterConducteur(Model model)
	{
		model.addAttribute("user",new User());
		
		return "ajouterConducteur";
	}
	@RequestMapping(value="/conducteur/SaveUser",method=RequestMethod.POST)
	public String save(User us)
	{
		propService.ajouterConducteur(us);
		
		
		
		return "conducteur";
	}
	@RequestMapping(value="/conducteur/voyage",method=RequestMethod.GET)
	public String ajouterVoyage(Model model)
	{
		
		model.addAttribute("voyage",new Voyage());
		
		
		return "voyage";
	}
	
	
	
	@RequestMapping(value= "/conducteur/voyages",method=RequestMethod.GET)
	public String listerVoyages(Model model,@RequestParam(name="username",defaultValue="")String username)	
	{
		List<Voyage> voyages=voyageRepository.voyageParUser2(username);
	
		model.addAttribute("listvoyages", voyages);
		
		model.addAttribute("username", username);
		
		return "voyages";
	}




}
