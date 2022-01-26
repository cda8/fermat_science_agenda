package fr.afpa.fermatscience.agenda.entity;

public class User {

	private int idUser;
	private String nameUser;
	private String surnameUser;
	private String mailUser;
	private String passwordUser;
	private int ageUser;
	
	public User() {
		
	}
	
	public User(String nameUser, String surnameUser, String mailUser, String passwordUser, int ageUser) {
		this.nameUser = nameUser;
		this.surnameUser = surnameUser;
		this.mailUser = mailUser;
		this.passwordUser = passwordUser;
		this.ageUser = ageUser;
	}

	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	public String getNameUser() {
		return nameUser;
	}
	public void setNameUser(String nameUser) {
		this.nameUser = nameUser;
	}
	public String getSurnameUser() {
		return surnameUser;
	}
	public void setSurnameUser(String surnameUser) {
		this.surnameUser = surnameUser;
	}
	public String getMailUser() {
		return mailUser;
	}
	public void setMailUser(String mailUser) {
		this.mailUser = mailUser;
	}
	public String getPasswordUser() {
		return passwordUser;
	}
	public void setPasswordUser(String passwordUser) {
		this.passwordUser = passwordUser;
	}
	public int getAgeUser() {
		return ageUser;
	}
	public void setAgeUser(int ageUser) {
		this.ageUser = ageUser;
	}
	
}
