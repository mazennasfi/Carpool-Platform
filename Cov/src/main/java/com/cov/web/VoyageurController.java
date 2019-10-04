package com.cov.web;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cov.entities.User;
import com.cov.repo.UserRepository;

@Controller
public class VoyageurController {
	@Autowired
	public UserRepository userRepository;
	

	/*@GetMapping("/user")
    public String addUser(Model model) {
        model.addAttribute("user", new User());
        return "user";
    }
	@PostMapping("/user")
    public String submitUser(@ModelAttribute User user) {
        return "result";
    }
    @PostMapping(value= "/users")
	public String displayStudents(Model model)	
	{
		List<User> users=userRepository.findAll();
		model.addAttribute("listusers", users);
		return "users";
	}*/
	@RequestMapping(value= "/voyageurs")
	public String listerVoyageurs(Model model)	
	{
		List<User> users=userRepository.findAll();
		model.addAttribute("listusers", users);
		return "users";
	}
	@RequestMapping(value="/voyageur",method=RequestMethod.GET)
	public String ajouterVoyageur(Model model)
	{
		model.addAttribute("user",new User());
		return "user";
	}
	@RequestMapping(value="/SaveUser",method=RequestMethod.POST)
	public String save(User us)
	{
		userRepository.save(us);
		
		return "user";
	}
	/*@RequestMapping(value="/save", method= RequestMethod.POST)
	public String SaveStudent(Model model , @Valid User user,BindingResult bindingResult )
	{
		if(bindingResult.hasErrors())
			return "users";
			
		userRepository.save(user);
		return "confirmation";
		
	}*/

	
}
