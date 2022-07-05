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
public class User {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Integer userID;
	@Column
	private char Mail;
	@Column
	private char Password;
	@Column
	private int Telephone;
	@Column
	private String Role;
	@Column
	private String Photo;
	@Column
	private boolean isValid;


}