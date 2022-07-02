package com.appasso.projet;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

//import java.util.ArrayList;
//import java.util.List;

//import javax.persistence.FetchType;
//import javax.persistence.OneToOne;


//import org.springframework.validation.annotation.Validated;

//import com.fasterxml.jackson.annotation.JsonFormat;
//import com.fasterxml.jackson.annotation.JsonIgnore;
//import com.fasterxml.jackson.annotation.JsonManagedReference;
//import com.appasso.projet.Model.Projet;
@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
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



}
