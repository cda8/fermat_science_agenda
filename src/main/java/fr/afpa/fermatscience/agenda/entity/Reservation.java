package fr.afpa.fermatscience.agenda.entity;

import java.util.Date;

public class Reservation {
	
private Integer numero_reservation;
private Date validite;
private float prix;

public Reservation(Integer numero_reservation, Date validite, float prix) {
	super();
	this.numero_reservation = numero_reservation;
	this.validite = validite;
	this.prix = prix;
}

public Integer getNumero_reservation() {
	return numero_reservation;
}

public void setNumero_reservation(Integer numero_reservation) {
	this.numero_reservation = numero_reservation;
}

public Date getValidite() {
	return validite;
}

public void setValidite(Date validite) {
	this.validite = validite;
}

public float getPrix() {
	return prix;
}

public void setPrix(float prix) {
	this.prix = prix;
}

@Override
public String toString() {
	return "Reservation [numero_reservation=" + numero_reservation + ", validite=" + validite + ", prix=" + prix + "]";
}








}
