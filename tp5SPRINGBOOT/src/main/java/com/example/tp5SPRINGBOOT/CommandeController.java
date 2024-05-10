package com.example.tp5SPRINGBOOT;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import jakarta.validation.Valid;
@Controller

public class CommandeController {
	@Autowired
	private CommandePetitDejeunerRepository commandeRepository;
	@GetMapping("/formulaire")
	public String afficherFormulaire(Model model) {
	model.addAttribute("commande", new PetitDejeuner());
	return "formulaire";
	}

	@PostMapping("/commande")
	public String traiterCommande(@Valid @ModelAttribute("commande")
	PetitDejeuner commande, BindingResult r, Model model) {
	model.addAttribute("commande", commande);
	  if (r.hasErrors()) {
         
          return "formulaire"; }
    
	  else { model.addAttribute("commande", commande);
      commandeRepository.save(commande);
      return "recapitulatif";
	}}
	
	
}
