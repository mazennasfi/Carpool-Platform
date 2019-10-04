package com.cov;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cov.entities.Demande;
import com.cov.repo.DemandeRepository;
import com.cov.repo.VoyageRepository;


@SpringBootApplication
public class CovApplication implements CommandLineRunner {
	@Autowired
	DemandeRepository demandeRepository;
	@Autowired
	VoyageRepository voyageRepository;
	Demande demande=new Demande();
	

	public static void main(String[] args) {
		SpringApplication.run(CovApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		demandeRepository.save(demande);
		
		
	
		
	}
	

	
	
	

}

