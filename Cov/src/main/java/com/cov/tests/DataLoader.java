package com.cov.tests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.cov.entities.Voyage;
import com.cov.repo.VoyageRepository;
import com.cov.metier.*;

@Component
public class DataLoader implements ApplicationRunner {

	@Autowired
    private  VoyageRepository voyageRepository;

   

    @Override
    public void run(ApplicationArguments args) {
        
    	voyageRepository.save(new Voyage());
    	voyageRepository.findAll();
    	
    	
    	
        
    }
}
