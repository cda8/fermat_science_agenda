package fr.afpa.fermatscience.agenda.entity;

public class User {

	private Integer idUser;
	private String nameUser;
	private String surnameUser;
	private String mailUser;
	private String passwordUser;
	private Integer ageUser;
	
	public User() {
		
	}
	
	public User(String nameUser, String surnameUser, String mailUser, String passwordUser, Integer ageUser) {
		this.nameUser = nameUser;
		this.surnameUser = surnameUser;
		this.mailUser = mailUser;
		this.passwordUser = passwordUser;
		this.ageUser = ageUser;
	}

	public Integer getIdUser() {
		return idUser;
	}
	public void setIdUser(Integer idUser) {
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
	public Integer getAgeUser() {
		return ageUser;
	}
	public void setAgeUser(Integer ageUser) {
		this.ageUser = ageUser;
	}
	
}
