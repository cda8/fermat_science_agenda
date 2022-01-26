package fr.afpa.fermatscience.agenda.entityJPA;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="Session")
@Table(name="Session")
public class SessionJPA {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idSession;
	private int nbrMaxSeatsSession;
	private Date startDateSession;
	private Date endDateSession;
	

	public SessionJPA() {}
	public SessionJPA(int nbrMaxSeats, Date startDate, Date endDate) {
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
