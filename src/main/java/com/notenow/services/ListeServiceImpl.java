package com.notenow.services;

import java.util.List;

import com.notenow.models.Liste;
import com.notenow.repositories.ListeRepository;

public class ListeServiceImpl implements ListeService{
	
	private ListeRepository listeRepository;
	
	public ListeServiceImpl(ListeRepository listeRepository) {
		this.listeRepository = listeRepository;
	}

	@Override
	public List<Liste> trouverToutesLesListes() {
		return this.listeRepository.findAll();
	}

	@Override
	public Liste trouverUneListe(Long id) {
		return this.listeRepository.findById(id).get();
	}

	@Override
	public Liste creerUneListe(Liste liste) {
		return this.listeRepository.save(liste);
	}

	@Override
	public void supprimerUneListe(Long id) {
		this.listeRepository.deleteById(id);
	}

}
