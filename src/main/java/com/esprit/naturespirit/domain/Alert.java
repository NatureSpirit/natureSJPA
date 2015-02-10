package com.esprit.naturespirit.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Alert {

	private int id;
	private String desciption;
	private String place;
	private String state;
	private Alertcategory categ;
	private Decision decision;

	public Alert() {
		// TODO Auto-generated constructor stub
	}

	public Alert(int id, String desciption, String place,
			String state) {

		this.id = id;
		this.desciption = desciption;
		this.place = place;
		this.state = state;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDesciption() {
		return desciption;
	}

	public void setDesciption(String desciption) {
		this.desciption = desciption;
	}


	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	@ManyToOne
	public Alertcategory getCateg() {
		return categ;
	}

	public void setCateg(Alertcategory categ) {
		this.categ = categ;
	}
	
	@OneToOne(mappedBy="alert")
	public Decision getDecision() {
		return decision;
	}
	public void setDecision(Decision decision) {
		this.decision = decision;
	}
}
