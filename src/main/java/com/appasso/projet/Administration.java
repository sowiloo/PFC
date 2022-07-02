package com.appasso.projet;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
//import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table

public class Administration {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private String CA;
	@Column
	private String Membres;
	@Column
	public String getCA() {
		return CA;
	}
	public void setCA(String cA) {
		CA = cA;
	}
	public String getMembres() {
		return Membres;
	}
	public void setMembres(String membres) {
		Membres = membres;
	}
	@Override
	public String toString() {
		return "Administration [CA=" + CA + ", Membres=" + Membres + "]";
	}
	public Administration(String cA, String membres) {
		super();
		CA = cA;
		Membres = membres;
	}
	public Administration() {
		super();
		// TODO Auto-generated constructor stub
	}
	  


}