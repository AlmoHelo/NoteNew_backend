package com.notenow;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.notenow.repositories.ListeRepository;
import com.notenow.services.ListeService;
import com.notenow.services.ListeServiceImpl;

@Configuration
public class ApplicationConfiguration {

	@Bean
	public ListeService listeService(ListeRepository listeRepository) {
		return new ListeServiceImpl(listeRepository);
	}
	
}
