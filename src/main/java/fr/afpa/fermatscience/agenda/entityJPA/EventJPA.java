package fr.afpa.fermatscience.agenda.entityJPA;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="Event")
@Table(name="Event")
public class EventJPA {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_event;
	private String name_event;
	private String theme_event;
	private Date summary_event;
	private Date start_date_event;
	private Date end_date_event;
	private String location;
	
	public EventJPA() {};
	
	public EventJPA(int id_event, String name_event, String theme_event, Date summary_event, Date start_date_event,
			Date end_date_event, String location) {
		this.id_event = id_event;
		this.name_event = name_event;
		this.theme_event = theme_event;
		this.summary_event = summary_event;
		this.start_date_event = start_date_event;
		this.end_date_event = end_date_event;
		this.location = location;
	}
	
	public int getId_event() {
		return id_event;
	}
	public void setId_event(int id_event) {
		this.id_event = id_event;
	}
	public String getName_event() {
		return name_event;
	}
	public void setName_event(String name_event) {
		this.name_event = name_event;
	}
	public String getTheme_event() {
		return theme_event;
	}
	public void setTheme_event(String theme_event) {
		this.theme_event = theme_event;
	}
	public Date getSummary_event() {
		return summary_event;
	}
	public void setSummary_event(Date summary_event) {
		this.summary_event = summary_event;
	}
	public Date getStart_date_event() {
		return start_date_event;
	}
	public void setStart_date_event(Date start_date_event) {
		this.start_date_event = start_date_event;
	}
	public Date getEnd_date_event() {
		return end_date_event;
	}
	public void setEnd_date_event(Date end_date_event) {
		this.end_date_event = end_date_event;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
}
