package com.cov.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cov.entities.User;
import com.cov.entities.Voyage;
import com.cov.metier.GererParAdmin;
import com.cov.metier.GererParAdminImpl;
import com.cov.repo.UserRepository;
import com.cov.repo.VoyageRepository;

@Controller
public class AdminController {
	@Autowired
	public GererParAdmin adminService;
	@Autowired
	public UserRepository userRepository;
	@Autowired
	public VoyageRepository voyageRepository;
	
	
	@RequestMapping(value="/admin",method=RequestMethod.GET)
	public String admin()
	{
		return "admin";
	}
	@RequestMapping(value= "/admin/clients")
	public String listerVoyageurs(Model model)	
	{
		
		List<User> users=userRepository.findAll();
		model.addAttribute("listusers", users);
		return "users";
	}
	@RequestMapping(value="admin/bannirClient/{id}")
	public String bannirClient(@PathVariable String id,RedirectAttributes redir)
	{
		adminService.bannirVoyageur(id);
		
		redir.addFlashAttribute("message", "client supprimé");
		return "redirect:/admin/clients";
	}
	@RequestMapping(value= "/admin/voyages")
	public String listerVoyages(Model model)	
	{
		
		List<Voyage> voyages=voyageRepository.findAll();
		model.addAttribute("listvoyages", voyages);
		return "voyagesAdmin";
	}
	@RequestMapping(value="admin/annulerVoyage/{id}")
	public String annulerVoyage(@PathVariable String id,RedirectAttributes redir)
	{
		voyageRepository.deleteById(id);
		redir.addFlashAttribute("message", "voyage supprimé");
		return "redirect:/admin/voyages";
	}

}
