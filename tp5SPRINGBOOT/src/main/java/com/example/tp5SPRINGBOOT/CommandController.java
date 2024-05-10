package com.example.tp5SPRINGBOOT;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/commande")
public class CommandController {
	@Autowired
	private CommandePetitDejeunerRepository commandeRepository;
	@GetMapping(path="/",produces= {MediaType.APPLICATION_JSON_VALUE})
	public List<PetitDejeuner> getAll(){
		List<PetitDejeuner> p=commandeRepository.findAll();
		return p;
	}
	@GetMapping(path="/{id}",produces= {MediaType.APPLICATION_JSON_VALUE})
	public PetitDejeuner getOne(@PathVariable Long id){
		PetitDejeuner p=commandeRepository.findById(id).get();
		return p;
	}
	@GetMapping(path="bynom/{nom}",produces= {MediaType.APPLICATION_JSON_VALUE})
	public List<PetitDejeuner> getByNom(@PathVariable int nom){
		List<PetitDejeuner> p=commandeRepository.findByChambre(nom);
		return p;
	}
	@GetMapping(path="bycom/{com}",produces= {MediaType.APPLICATION_JSON_VALUE})
	public List<PetitDejeuner> getByCom(@PathVariable String com){
		List<PetitDejeuner> p=commandeRepository.findByCommentairesContaining(com);
		return p;
	}
	
	@PostMapping(path="/save",produces= {MediaType.APPLICATION_JSON_VALUE})
	public PetitDejeuner save(@RequestBody PetitDejeuner p) {
		return commandeRepository.save(p);
	}
	@PutMapping(path="/edit/{id}")
	public PetitDejeuner update(@RequestBody PetitDejeuner p,@PathVariable Long id) {
		p.setId(id);
		return commandeRepository.save(p);
	}
	
	
	@DeleteMapping(path="/delete/{id}")
	public void delete(@PathVariable Long id) {
		commandeRepository.deleteById(id);
	}
	
}
