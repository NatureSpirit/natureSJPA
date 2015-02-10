package com.esprit.naturespirit.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Action {

	private int id;
	private String desciption;
	private Date date;
	private String place;
	private String state;
	private Actcategory categ;
	private Decision decision;

	public Action() {
		// TODO Auto-generated constructor stub
	}

	public Action(int id, String desciption, Date date, String place,
			String state) {

		this.id = id;
		this.desciption = desciption;
		this.date = date;
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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
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
	public Actcategory getCateg() {
		return categ;
	}

	public void setCateg(Actcategory categ) {
		this.categ = categ;
	}
	
	@OneToOne(mappedBy="action")
	public Decision getDecision() {
		return decision;
	}
	public void setDecision(Decision decision) {
		this.decision = decision;
	}
}
