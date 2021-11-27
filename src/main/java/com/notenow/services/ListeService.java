package com.notenow.services;

import java.util.List;

import com.notenow.models.Liste;

public interface ListeService {

	List<Liste> trouverToutesLesListes();

	Liste trouverUneListe(Long id);

	Liste creerUneListe(Liste liste);

	void supprimerUneListe(Long id);

}
