package com.cov.entities;

import org.springframework.data.annotation.Id;

import org.springframework.data.geo.Point;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="localisations")
public class Localisation {

    

	@Id

    private String nom;

    private Point point;
 
    
    public Localisation() {
		super();
		// TODO Auto-generated constructor stub
		
	}

    





	


	public Localisation(String nom) {
		super();
		this.nom = nom;
	}




	public Localisation( String nom, Point point) {
		super();
		
		this.nom = nom;
		this.point = point;
	}



	public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }


}
