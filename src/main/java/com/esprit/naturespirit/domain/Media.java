package com.esprit.naturespirit.domain;

import java.io.Serializable;

import javax.persistence.Entity;



@Entity
public class Media extends OfficialContent implements Serializable{

	
	private static final long serialVersionUID = 1L;
  
	private String type;
	private String content;
	
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
}
