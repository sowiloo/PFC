package com.appasso.projet;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
//import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table

public class Association {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column
    private String Presentation;
	@Column
	private String Statut;
	
	public String getPresentation() {
		return Presentation;
	}
	public void setPresentation(String presentation) {
		Presentation = presentation;
	}
	public String getStatut() {
		return Statut;
	}
	public void setStatut(String statut) {
		Statut = statut;
	}
	@Override
	public String toString() {
		return "Association [Presentation=" + Presentation + ", Statut=" + Statut + "]";
	}
	public Association(String presentation, String statut) {
		super();
		Presentation = presentation;
		Statut = statut;
	}
	public Association() {
		super();
		// TODO Auto-generated constructor stub
	}



}
