package com.appasso.projet;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
//import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table

public class Utilisateur{
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
	
	public char getMail() {
		return Mail;
	}
	public void setMail(char mail) {
		Mail = mail;
	}
	public char getPassword() {
		return Password;
	}
	public void setPassword(char password) {
		Password = password;
	}
	public int getTelephon() {
		return Telephon;
	}
	public void setTelephon(int telephon) {
		Telephon = telephon;
	}
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}
	public String getPhoto() {
		return Photo;
	}
	public void setPhoto(String photo) {
		Photo = photo;
	}
	@Override
	public String toString() {
		return "Utilisateur [Mail=" + Mail + ", Password=" + Password + ", Telephon=" + Telephon + ", Role=" + Role
				+ ", Photo=" + Photo + "]";
	}
	public Utilisateur(char mail, char password, int telephon, String role, String photo) {
		super();
		Mail = mail;
		Password = password;
		Telephon = telephon;
		Role = role;
		Photo = photo;
	}
	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	  
	  

}