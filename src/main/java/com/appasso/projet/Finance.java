package com.appasso.projet;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table

public class Finance {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private float Charges;
	@Column
	private float Cotisations;
	@Column
	private float Donations;
	@Column
	private String nomBailleur;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getCharges() {
		return Charges;
	}
	public void setCharges(float charges) {
		Charges = charges;
	}
	public float getCotisations() {
		return Cotisations;
	}
	public void setCotisations(float cotisations) {
		Cotisations = cotisations;
	}
	public float getDonations() {
		return Donations;
	}
	public void setDonations(float donations) {
		Donations = donations;
	}
	public String getNomBailleur() {
		return nomBailleur;
	}
	public void setNomBailleur(String nomBailleur) {
		this.nomBailleur = nomBailleur;
	}
	@Override
	public String toString() {
		return "Finance [id=" + id + ", Charges=" + Charges + ", Cotisations=" + Cotisations + ", Donations="
				+ Donations + ", nomBailleur=" + nomBailleur + "]";
	}
	public Finance(int id, float charges, float cotisations, float donations, String nomBailleur) {
		super();
		this.id = id;
		Charges = charges;
		Cotisations = cotisations;
		Donations = donations;
		this.nomBailleur = nomBailleur;
	}
	public Finance() {
		super();
		// TODO Auto-generated constructor stub
	}
	


	
}
