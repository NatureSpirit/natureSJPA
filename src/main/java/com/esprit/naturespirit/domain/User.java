package com.esprit.naturespirit.domain;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;





@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class User implements Serializable {

	
	private int id;
	private String login;
	private String pwd;
	private String name;
	private String surname;
	private int age;
	private String country;
	private String email;
	private List<Decision> decisions;
	
	
	private static final long serialVersionUID = 1L;

	public User() {
		super();
	}   
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}   
	public String getPwd() {
		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}   
	public String getSurname() {
		return this.surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}   
	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}   
	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}   
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@ManyToMany(mappedBy="users")
	public List<Decision> getDecisions() {
		return decisions;
	}
	public void setDecisions(List<Decision> decisions) {
		this.decisions = decisions;
	}
   
}
