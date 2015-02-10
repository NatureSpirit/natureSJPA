package com.esprit.naturespirit.domain;

import java.util.*;

import javax.persistence.Entity;
@Entity
public class Invitation extends Decision {
	private Date inv_date;

	public Invitation() {
		// TODO Auto-generated constructor stub
	}

	public Invitation(Date inv_date) {
		super();

		this.setInv_date(inv_date);
	}

	public Date getInv_date() {
		return inv_date;
	}

	public void setInv_date(Date inv_date) {
		this.inv_date = inv_date;
	}

}
