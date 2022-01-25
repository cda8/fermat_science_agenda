package fr.afpa.fermatscience.agenda.entity;

public class Role {

    private int idRole;
    private String libelleRole;

    public Role() {
    }

    public Role(String libelleRole) {
        this.libelleRole = libelleRole;
    }

    public int getIdRole() {
        return idRole;
    }

    public void setIdRole(int idRole) {
        this.idRole = idRole;
    }

    public String getLibelleRole() {
        return libelleRole;
    }

    public void setLibelleRole(String libelleRole) {
        this.libelleRole = libelleRole;
    }
}
