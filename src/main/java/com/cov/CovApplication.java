package com.cov;


import org.springframework.data.domain.PageRequest;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cov.entities.Demande;
import com.cov.entities.Voyage;
import com.cov.repo.DemandeRepository;
import com.cov.repo.VoyageRepository;


@SpringBootApplication
public class CovApplication implements CommandLineRunner {
	
	@Autowired
	VoyageRepository voy;
	

	public static void main(String[] args) {
		SpringApplication.run(CovApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		//Page<Voyage>voys=voy.voyageParUser("Majd",new PageRequest(0, 1));
	//	List<Voyage>voys=voy.findAll();
		//voys.forEach(e->System.out.println(e.getDep()));
	
		
	}
	

	
	
	

}

