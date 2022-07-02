package com.appasso.projet;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table


public class Activité {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String nom;
	@Column
	private char DemandeJustifBancaire;
	@Column
	private char FicheBudget;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public char getDemandeJustifBancaire() {
		return DemandeJustifBancaire;
	}
	public void setDemandeJustifBancaire(char demandeJustifBancaire) {
		DemandeJustifBancaire = demandeJustifBancaire;
	}
	public char getFicheBudget() {
		return FicheBudget;
	}
	public void setFicheBudget(char ficheBudget) {
		FicheBudget = ficheBudget;
	}
	@Override
	public String toString() {
		return "Activité [id=" + id + ", nom=" + nom + ", DemandeJustifBancaire=" + DemandeJustifBancaire
				+ ", FicheBudget=" + FicheBudget + "]";
	}
	public Activité(int id, String nom, char demandeJustifBancaire, char ficheBudget) {
		super();
		this.id = id;
		this.nom = nom;
		DemandeJustifBancaire = demandeJustifBancaire;
		FicheBudget = ficheBudget;
	}
	public Activité() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
