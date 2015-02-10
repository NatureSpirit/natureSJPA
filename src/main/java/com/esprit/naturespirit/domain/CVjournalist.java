package com.esprit.naturespirit.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class CVjournalist implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id ; 
	private String studies ; 
	private String coordinates ;
	private SimpleUser simple;
	
	
	
	public CVjournalist()  {
		super();
	}
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudies() {
		return studies;
	}
	public void setStudies(String studies) {
		this.studies = studies;
	}
	public String getCoordinates() {
		return coordinates;
	}
	public void setCoordinates(String coordinates) {
		this.coordinates = coordinates;
	}


	
	@OneToOne(mappedBy="cv")
	public SimpleUser getSimple() {
		return simple;
	}


	public void setSimple(SimpleUser simple) {
		this.simple = simple;
	} 
	
	
	

}
