package fr.afpa.event.entites;

import java.util.Date;

public class Occurrence {


    private int idOccurence;
    private int nbPlacesMax;
    private Date dateDebutOccurence;
    private Date dateFinOccurence;


    public Occurrence() {
    }

    public Occurrence(int nbPlacesMax, Date dateDebutOccurence, Date dateFinOccurence) {
        this.nbPlacesMax = nbPlacesMax;
        this.dateDebutOccurence = dateDebutOccurence;
        this.dateFinOccurence = dateFinOccurence;
    }

    public int getIdOccurence() {
        return idOccurence;
    }

    public void setIdOccurence(int idOccurence) {
        this.idOccurence = idOccurence;
    }

    public int getNbPlacesMax() {
        return nbPlacesMax;
    }

    public void setNbPlacesMax(int nbPlacesMax) {
        this.nbPlacesMax = nbPlacesMax;
    }

    public Date getDateDebutOccurence() {
        return dateDebutOccurence;
    }

    public void setDateDebutOccurence(Date dateDebutOccurence) {
        this.dateDebutOccurence = dateDebutOccurence;
    }

    public Date getDateFinOccurence() {
        return dateFinOccurence;
    }

    public void setDateFinOccurence(Date dateFinOccurence) {
        this.dateFinOccurence = dateFinOccurence;
    }
}