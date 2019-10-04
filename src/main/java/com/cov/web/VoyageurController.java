package com.cov.web;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cov.entities.Demande;
import com.cov.entities.User;
import com.cov.entities.Voyage;
import com.cov.metier.GererDemande;
import com.cov.repo.DemandeRepository;
import com.cov.repo.UserRepository;
import com.cov.repo.VoyageRepository;

@Controller
public class VoyageurController {
	@Autowired
	public VoyageRepository voyageRepository;
	@Autowired
	public UserRepository userRepository;
	@Autowired
	public GererDemande demandeService; 
	@Autowired
	public DemandeRepository demandeRepository;
	
	@RequestMapping(value="/voyageur",method=RequestMethod.GET)
	public String home()
	{
		return "voyageur";
	}
	
	
	@RequestMapping(value="/voyageur/creer",method=RequestMethod.GET)
	public String ajouterVoyageur(Model model)
	{
		model.addAttribute("user",new User());
		
		return "ajouterVoyageur";
	}
	@RequestMapping(value="/voyageur/SaveUser",method=RequestMethod.POST)
	public String save(User us)
	{
		demandeService.ajouterVoyageur(us);
		
		
		
		return "voyageur";
	}
	@RequestMapping(value= "/voyageur/voyages",method=RequestMethod.GET)
	public String listerVoyages(Model model,@RequestParam(name="depart",defaultValue="")String depart,@RequestParam(name="username",defaultValue="")String username)	
	{
		List<Voyage> voyages=voyageRepository.voyageParDepart(depart);
	
		model.addAttribute("listvoyages", voyages);
		
		model.addAttribute("depart", depart);
		
		
		return "demande";
	}
	@RequestMapping(value="voyageur/ajouterDemande/{id}")
	public String ajouterDemande(@PathVariable String id,RedirectAttributes redir)
	{
		demandeService.ajouterDemande(id);
		redir.addFlashAttribute("message", "demande envoyee");
		return "redirect:/voyageur/voyages";
	}
	@RequestMapping(value="voyageur/demandes")
	public String ajouterDemande(Model model,@RequestParam(name="user",defaultValue="")String user)
	{
		List<Demande> demandes=demandeRepository.findAll();
		//List<Demande> demandes=demandeRepository.demandeParUser(user);
		model.addAttribute("listdemandes", demandes);
		//model.addAttribute("user", user);
		return "demandes";
	}
	@RequestMapping(value="voyageur/annulerDemande/{id}")
	public String annulerDemande(@PathVariable String id,RedirectAttributes redir)
	{
		demandeRepository.deleteById(id);
		redir.addFlashAttribute("message", "demande supprimé");
		return "redirect:/voyageur/demandes";
	}
	
	
	
	
}
