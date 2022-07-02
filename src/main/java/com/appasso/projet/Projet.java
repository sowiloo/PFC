package com.appasso.projet;


//import javax.persistence.OneToOne;
//import javax.persistence.CascadeType;
//import javax.persistence.FetchType;
//import com.fasterxml.jackson.annotation.JsonBackReference;
//import com.appasso.projet.Model.Document;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
@Entity
@Table

public class Projet {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	@Column
	private String nom;
	@Column
	private String fichedescriptif;
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
	public String getFichedescriptif() {
		return fichedescriptif;
	}
	public void setFichedescriptif(String fichedescriptif) {
		this.fichedescriptif = fichedescriptif;
	}
	@Override
	public String toString() {
		return "Projet [id=" + id + ", nom=" + nom + ", fichedescriptif=" + fichedescriptif + "]";
	}
	public Projet(String nom, String fichedescriptif) {
		super();
		this.nom = nom;
		this.fichedescriptif = fichedescriptif;
	}
	public Projet() {
		super();
		// TODO Auto-generated constructor stub
	}
	  
	
	

}
