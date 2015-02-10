package com.esprit.naturespirit.domain;


import java.io.Serializable;
import java.lang.Boolean;
import java.util.List;



import javax.persistence.*;


@Entity
public class SimpleUser extends User implements Serializable {

	
	private Boolean state_journalist;
	private Newsletter newsletter;
	private CVjournalist cv;
	private Blog blog;
	private List<Donation> donations;
	private List<Article> articles;
	
	
	
	private static final long serialVersionUID = 1L;

	public SimpleUser() {
		super();
	}   
	public Boolean getState_journalist() {
		return this.state_journalist;
	}

	public void setState_journalist(Boolean state_journalist) {
		this.state_journalist = state_journalist;
	}
	@ManyToOne
	public Newsletter getNewsletter() {
		return newsletter;
	}
	public void setNewsletter(Newsletter newsletter) {
		this.newsletter = newsletter;
	}
	
	@OneToMany(mappedBy="simple")
	public List<Article> getArticles() {
		return articles;
	}
	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}
	
	@OneToOne 
	@JoinColumn(name="fk_cv ")
	public CVjournalist getCv() {
		return cv;
	}
	public void setCv(CVjournalist cv) {
		this.cv = cv;
	}
	
	@OneToOne(mappedBy="simpleUser")
	public Blog getBlog() {
		return blog;
	}
	public void setBlog(Blog blog) {
		this.blog = blog;
	}
	
	@OneToMany(mappedBy="simpleUser")
	public List<Donation> getDonations() {
		return donations;
	}
	public void setDonations(List<Donation> donations) {
		this.donations = donations;
	}
   
}
