package com.appasso.projet;

import javax.persistence.Column;

//import java.util.ArrayList;
//import java.util.List;

//import javax.persistence.FetchType;
//import javax.persistence.OneToOne;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//import org.springframework.validation.annotation.Validated;

//import com.fasterxml.jackson.annotation.JsonFormat;
//import com.fasterxml.jackson.annotation.JsonIgnore;
//import com.fasterxml.jackson.annotation.JsonManagedReference;
//import com.appasso.projet.Model.Projet;
@Entity
@Table

public class Document {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String ContratProjet;
	@Column
	private String DeclarationsFiscale;
	@Column
	private String DemandePaiment;
	@Column
	private String RapportActivite;
	@Column
	private String RapportFinancier;
	@Column
	private String SupportCom;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContratProjet() {
		return ContratProjet;
	}
	public void setContratProjet(String contratProjet) {
		ContratProjet = contratProjet;
	}
	public String getDeclarationsFiscale() {
		return DeclarationsFiscale;
	}
	public void setDeclarationsFiscale(String declarationsFiscale) {
		DeclarationsFiscale = declarationsFiscale;
	}
	public String getDemandePaiment() {
		return DemandePaiment;
	}
	public void setDemandePaiment(String demandePaiment) {
		DemandePaiment = demandePaiment;
	}
	public String getRapportActivite() {
		return RapportActivite;
	}
	public void setRapportActivite(String rapportActivite) {
		RapportActivite = rapportActivite;
	}
	public String getRapportFinancier() {
		return RapportFinancier;
	}
	public void setRapportFinancier(String rapportFinancier) {
		RapportFinancier = rapportFinancier;
	}
	public String getSupportCom() {
		return SupportCom;
	}
	public void setSupportCom(String supportCom) {
		SupportCom = supportCom;
	}
	@Override
	public String toString() {
		return "Document [id=" + id + ", ContratProjet=" + ContratProjet + ", DeclarationsFiscale="
				+ DeclarationsFiscale + ", DemandePaiment=" + DemandePaiment + ", RapportActivite=" + RapportActivite
				+ ", RapportFinancier=" + RapportFinancier + ", SupportCom=" + SupportCom + "]";
	}
	public Document(int id, String contratProjet, String declarationsFiscale, String demandePaiment,
			String rapportActivite, String rapportFinancier, String supportCom) {
		super();
		this.id = id;
		ContratProjet = contratProjet;
		DeclarationsFiscale = declarationsFiscale;
		DemandePaiment = demandePaiment;
		RapportActivite = rapportActivite;
		RapportFinancier = rapportFinancier;
		SupportCom = supportCom;
	}
	public Document() {
		super();
		// TODO Auto-generated constructor stub
	}
	


	
}
