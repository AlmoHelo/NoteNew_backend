package com.notenow.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.notenow.models.Liste;
import com.notenow.services.ListeService;

@CrossOrigin
@RestController
@RequestMapping("listes")
public class ListeController {

	@Autowired
	private ListeService listeService;

	@GetMapping("")
	public List<Liste> trouverToutesLesListes(){
		return listeService.trouverToutesLesListes();
	}
	
	@GetMapping("{id}")
	public Liste trouverUneListe(@PathVariable Long id){
		return listeService.trouverUneListe(id);
	}
	
	@PostMapping("")
	public Liste creerUneListe(@RequestBody Liste liste){
		return listeService.creerUneListe(liste);
	}
	
	@DeleteMapping("{id}")
	public void supprimerUneListe(@PathVariable Long id) {
		listeService.supprimerUneListe(id);
	}
	
}
