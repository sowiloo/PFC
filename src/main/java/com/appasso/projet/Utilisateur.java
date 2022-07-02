package com.appasso.projet;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
//import javax.persistence.Id;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Utilisateur{

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int id;
	@Column
	private char Mail;
	@Column
	private char Password;
	@Column
	private int Telephon;
	@Column
	private String Role;
	@Column
	private String Photo;

}