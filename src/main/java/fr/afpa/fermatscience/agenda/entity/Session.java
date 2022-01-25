package fr.afpa.fermatscience.agenda.entity;

import java.util.Date;

public class Session {
	private int idSession;
	private int nbrMaxSeatsSession;
	private Date startDateSession;
	private Date endDateSession;
	
	public Session() {}
	public Session(int nbrMaxSeats, Date startDate, Date endDate) {
		this.nbrMaxSeatsSession = nbrMaxSeats;
		this.startDateSession = startDate;
		this.endDateSession = endDate;
	}
	public int getIdSession() {
		return idSession;
	}
	public void setIdSession(int idSession) {
		this.idSession = idSession;
	}
	public int getNbrMaxSeatsSession() {
		return nbrMaxSeatsSession;
	}
	public void setNbrMaxSeatsSession(int nbrMaxSeatsSession) {
		this.nbrMaxSeatsSession = nbrMaxSeatsSession;
	}
	public Date getStartDateSession() {
		return startDateSession;
	}
	public void setStartDateSession(Date startDateSession) {
		this.startDateSession = startDateSession;
	}
	public Date getEndDateSession() {
		return endDateSession;
	}
	public void setEndDateSession(Date endDateSession) {
		this.endDateSession = endDateSession;
	}
	
	
}
